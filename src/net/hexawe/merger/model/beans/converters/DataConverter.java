package net.hexawe.merger.model.beans.converters;

import net.hexawe.merger.model.beans.Data;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class DataConverter implements Converter{
	/**
	 * It checks that clazz is a subclass of abstract type A_Data
	 * @param clazz The class being tested
	 * @return if it's a A_Data subclass
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean canConvert(Class clazz) {
		return Data.class.isAssignableFrom(clazz);
	}

	@Override
	public void marshal(Object obj, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		Data data = (Data) obj;
		writer.startNode("DATA");
		if(data.getContent() == null){
			writer.addAttribute("VALUE", String.valueOf(data.getValue()));
			writer.addAttribute("LENGTH", String.valueOf(data.getLength()));
		}else{
			int[] content = data.getContent();
			StringBuffer strb = new StringBuffer();
			for(int i=0; i < content.length; i++){
				String hexString = Integer.toHexString(content[i]);
				strb.append(hexString.substring(hexString.length()-2, hexString.length()-1));
			}
			writer.setValue(strb.toString());
		}
		writer.endNode();
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context){
		Data data = new Data();
		String value = reader.getAttribute("VALUE");
		String length = reader.getAttribute("LENGTH");
		if((value != null && length != null) || !(value.equals("") || length.equals(""))){
			// it's an empty node
			data.setValue(Integer.parseInt(value));
			data.setLength(Integer.parseInt(length));
		}else{
			// full node
			reader.moveDown();
			String rawData = reader.getValue();
			reader.moveUp();
			int byteLength = rawData.length() /2;
			int[] intData = new int[byteLength];
			for(int i=0; i < byteLength; i=i+2){
				String strByte = "0x"+rawData.substring(i, i+1);
				intData[i/2] = Integer.decode(strByte);
			}
			data.setContent(intData);
		}
		
		return data;
	}
}
