package net.hexawe.merger.model.beans;

public class Data {
	private int value;
	private int length;
	private int[] content;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int[] getContent() {
		return content;
	}

	public void setContent(int[] content) {
		this.content = content;
	}
	//public abstract XStream tweakXStream(XStream xstream);
}
