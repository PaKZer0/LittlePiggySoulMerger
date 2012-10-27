package net.hexawe.merger.model.beans;

import java.util.List;

public class Table {
	private int id;
	
	private List<CommandData> COM1;
	private List<ParamData> PARAM1;
	private List<CommandData> COM2;
	private List<ParamData> PARAM2;
	private List<CommandData> COM3;
	private List<ParamData> PARAM3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<CommandData> getCOM1() {
		return COM1;
	}
	public void setCOM1(List<CommandData> cOM1) {
		COM1 = cOM1;
	}
	public List<ParamData> getPARAM1() {
		return PARAM1;
	}
	public void setPARAM1(List<ParamData> pARAM1) {
		PARAM1 = pARAM1;
	}
	public List<CommandData> getCOM2() {
		return COM2;
	}
	public void setCOM2(List<CommandData> cOM2) {
		COM2 = cOM2;
	}
	public List<ParamData> getPARAM2() {
		return PARAM2;
	}
	public void setPARAM2(List<ParamData> pARAM2) {
		PARAM2 = pARAM2;
	}
	public List<CommandData> getCOM3() {
		return COM3;
	}
	public void setCOM3(List<CommandData> cOM3) {
		COM3 = cOM3;
	}
	public List<ParamData> getPARAM3() {
		return PARAM3;
	}
	public void setPARAM3(List<ParamData> pARAM3) {
		PARAM3 = pARAM3;
	}
	
}
