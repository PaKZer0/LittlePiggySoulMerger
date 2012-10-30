package net.hexawe.merger.model.beans;

import com.thoughtworks.xstream.XStream;

public class Instrument {
	private int id;
	
	private Parameter sample;
	private Parameter volume;
	private Parameter interpol;
	private Parameter crush;
	private Parameter crushDrive;
	private Parameter rootNote;
	private Parameter pan;
	private Parameter filterCut;
	private Parameter filterRes;
	private Parameter start;
	private Parameter loopMode;
	private Parameter loopStart;
	private Parameter end;
	private Parameter table;
	private Parameter automation;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Parameter getSample() {
		return sample;
	}
	public void setSample(Parameter sample) {
		this.sample = sample;
	}
	public Parameter getVolume() {
		return volume;
	}
	public void setVolume(Parameter volume) {
		this.volume = volume;
	}
	public Parameter getInterpol() {
		return interpol;
	}
	public void setInterpol(Parameter interpol) {
		this.interpol = interpol;
	}
	public Parameter getCrush() {
		return crush;
	}
	public void setCrush(Parameter crush) {
		this.crush = crush;
	}
	public Parameter getCrushDrive() {
		return crushDrive;
	}
	public void setCrushDrive(Parameter crushDrive) {
		this.crushDrive = crushDrive;
	}
	public Parameter getRootNote() {
		return rootNote;
	}
	public void setRootNote(Parameter rootNote) {
		this.rootNote = rootNote;
	}
	public Parameter getPan() {
		return pan;
	}
	public void setPan(Parameter pan) {
		this.pan = pan;
	}
	public Parameter getFilterCut() {
		return filterCut;
	}
	public void setFilterCut(Parameter filterCut) {
		this.filterCut = filterCut;
	}
	public Parameter getFilterRes() {
		return filterRes;
	}
	public void setFilterRes(Parameter filterRes) {
		this.filterRes = filterRes;
	}
	public Parameter getStart() {
		return start;
	}
	public void setStart(Parameter start) {
		this.start = start;
	}
	public Parameter getLoopMode() {
		return loopMode;
	}
	public void setLoopMode(Parameter loopMode) {
		this.loopMode = loopMode;
	}
	public Parameter getLoopStart() {
		return loopStart;
	}
	public void setLoopStart(Parameter loopStart) {
		this.loopStart = loopStart;
	}
	public Parameter getEnd() {
		return end;
	}
	public void setEnd(Parameter end) {
		this.end = end;
	}
	public Parameter getTable() {
		return table;
	}
	public void setTable(Parameter table) {
		this.table = table;
	}
	public Parameter isAutomation() {
		return automation;
	}
	public void setAutomation(Parameter automation) {
		this.automation = automation;
	}
	
	public XStream setXStream(XStream xstream){
		xstream.alias("INSTRUMENT", Instrument.class);
		xstream.aliasField("ID", Project.class, "id");
		xstream.alias("PARAM", Parameter.class);
		xstream.aliasField("NAME", Parameter.class, "name");
		xstream.aliasField("VALUE", Parameter.class, "value");
		return xstream;
	}
}
