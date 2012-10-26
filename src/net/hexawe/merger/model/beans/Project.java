package net.hexawe.merger.model.beans;

public class Project {
	private String version;
	
	private int tempo;
	private int master;
	private String wrap;
	private String midi;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getMaster() {
		return master;
	}
	public void setMaster(int master) {
		this.master = master;
	}
	public String getWrap() {
		return wrap;
	}
	public void setWrap(String wrap) {
		this.wrap = wrap;
	}
	public String getMidi() {
		return midi;
	}
	public void setMidi(String midi) {
		this.midi = midi;
	}
}
