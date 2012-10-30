package net.hexawe.merger.model.beans;

import com.thoughtworks.xstream.XStream;

public class Project {
	private String version;
	
	private Parameter tempo;
	private Parameter master;
	private Parameter wrap;
	private Parameter midi;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Parameter getTempo() {
		return tempo;
	}
	public void setTempo(Parameter tempo) {
		this.tempo = tempo;
	}
	public Parameter getMaster() {
		return master;
	}
	public void setMaster(Parameter master) {
		this.master = master;
	}
	public Parameter getWrap() {
		return wrap;
	}
	public void setWrap(Parameter wrap) {
		this.wrap = wrap;
	}
	public Parameter getMidi() {
		return midi;
	}
	public void setMidi(Parameter midi) {
		this.midi = midi;
	}
	
	public XStream setXStream(XStream xstream){
		xstream.alias("PROJECT", Project.class);
		xstream.aliasField("VERSION", Project.class, "version");
		xstream.alias("PARAMETER", Parameter.class);
		xstream.aliasField("NAME", Parameter.class, "name");
		xstream.aliasField("VALUE", Parameter.class, "value");
		return xstream;
	}
}
