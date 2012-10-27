package net.hexawe.merger.model.beans;

import java.util.List;

public class LittleGPTracker {
	private Project PROJECT;
	private Song SONG;
	private List<Instrument> INSTRUMENTBANK;
	private List<Table> TABLES;
	
	public Project getPROJECT() {
		return PROJECT;
	}
	public void setPROJECT(Project pROJECT) {
		PROJECT = pROJECT;
	}
	public Song getSONG() {
		return SONG;
	}
	public void setSONG(Song sONG) {
		SONG = sONG;
	}
	public List<Instrument> getINSTRUMENTBANK() {
		return INSTRUMENTBANK;
	}
	public void setINSTRUMENTBANK(List<Instrument> iNSTRUMENTBANK) {
		INSTRUMENTBANK = iNSTRUMENTBANK;
	}
	public List<Table> getTABLES() {
		return TABLES;
	}
	public void setTABLES(List<Table> tABLES) {
		TABLES = tABLES;
	}
}
