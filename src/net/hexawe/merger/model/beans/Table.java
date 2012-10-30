package net.hexawe.merger.model.beans;

import java.util.List;

public class Table {
	private int id;
	
	private List<Data> COM1;
	private List<Data> PARAM1;
	private List<Data> COM2;
	private List<Data> PARAM2;
	private List<Data> COM3;
	private List<Data> PARAM3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Data> getCOM1() {
		return COM1;
	}
	public void setCOM1(List<Data> cOM1) {
		COM1 = cOM1;
	}
	public List<Data> getPARAM1() {
		return PARAM1;
	}
	public void setPARAM1(List<Data> pARAM1) {
		PARAM1 = pARAM1;
	}
	public List<Data> getCOM2() {
		return COM2;
	}
	public void setCOM2(List<Data> cOM2) {
		COM2 = cOM2;
	}
	public List<Data> getPARAM2() {
		return PARAM2;
	}
	public void setPARAM2(List<Data> pARAM2) {
		PARAM2 = pARAM2;
	}
	public List<Data> getCOM3() {
		return COM3;
	}
	public void setCOM3(List<Data> cOM3) {
		COM3 = cOM3;
	}
	public List<Data> getPARAM3() {
		return PARAM3;
	}
	public void setPARAM3(List<Data> pARAM3) {
		PARAM3 = pARAM3;
	}
	
}
