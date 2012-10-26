package net.hexawe.merger.model.beans;

public class Instrument {
	private int id;
	
	private String	sample;
	private int		volume;
	private String	interpol;
	private int		crush;
	private int		crushDrive;
	private int		rootNote;
	private int		pan;
	private int		filterCut;
	private int		filterRes;
	private long	start;
	private String	loopMode;
	private long	loopStart;
	private long	end;
	private int		table;
	private boolean	automation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSample() {
		return sample;
	}
	public void setSample(String sample) {
		this.sample = sample;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getInterpol() {
		return interpol;
	}
	public void setInterpol(String interpol) {
		this.interpol = interpol;
	}
	public int getCrush() {
		return crush;
	}
	public void setCrush(int crush) {
		this.crush = crush;
	}
	public int getCrushDrive() {
		return crushDrive;
	}
	public void setCrushDrive(int crushDrive) {
		this.crushDrive = crushDrive;
	}
	public int getRootNote() {
		return rootNote;
	}
	public void setRootNote(int rootNote) {
		this.rootNote = rootNote;
	}
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	public int getFilterCut() {
		return filterCut;
	}
	public void setFilterCut(int filterCut) {
		this.filterCut = filterCut;
	}
	public int getFilterRes() {
		return filterRes;
	}
	public void setFilterRes(int filterRes) {
		this.filterRes = filterRes;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public String getLoopMode() {
		return loopMode;
	}
	public void setLoopMode(String loopMode) {
		this.loopMode = loopMode;
	}
	public long getLoopStart() {
		return loopStart;
	}
	public void setLoopStart(long loopStart) {
		this.loopStart = loopStart;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public boolean isAutomation() {
		return automation;
	}
	public void setAutomation(boolean automation) {
		this.automation = automation;
	}	
}
