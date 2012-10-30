package net.hexawe.merger.model.beans;

import java.util.List;

public class Song {
	private List<Data> SONG;
	private List<Data> CHAINS;
	private List<Data> TRANSPOSES;
	private List<Data> NOTES;
	private List<Data> INSTRUMENTS;
	private List<Data> COMMAND1;
	private List<Data> PARAM1;
	private List<Data> COMMAND2;
	private List<Data> PARAM2;
	public List<Data> getSONG() {
		return SONG;
	}
	public void setSONG(List<Data> sONG) {
		SONG = sONG;
	}
	public List<Data> getCHAINS() {
		return CHAINS;
	}
	public void setCHAINS(List<Data> cHAINS) {
		CHAINS = cHAINS;
	}
	public List<Data> getTRANSPOSES() {
		return TRANSPOSES;
	}
	public void setTRANSPOSES(List<Data> tRANSPOSES) {
		TRANSPOSES = tRANSPOSES;
	}
	public List<Data> getNOTES() {
		return NOTES;
	}
	public void setNOTES(List<Data> nOTES) {
		NOTES = nOTES;
	}
	public List<Data> getINSTRUMENTS() {
		return INSTRUMENTS;
	}
	public void setINSTRUMENTS(List<Data> iNSTRUMENTS) {
		INSTRUMENTS = iNSTRUMENTS;
	}
	public List<Data> getCOMMAND1() {
		return COMMAND1;
	}
	public void setCOMMAND1(List<Data> cOMMAND1) {
		COMMAND1 = cOMMAND1;
	}
	public List<Data> getPARAM1() {
		return PARAM1;
	}
	public void setPARAM1(List<Data> pARAM1) {
		PARAM1 = pARAM1;
	}
	public List<Data> getCOMMAND2() {
		return COMMAND2;
	}
	public void setCOMMAND2(List<Data> cOMMAND2) {
		COMMAND2 = cOMMAND2;
	}
	public List<Data> getPARAM2() {
		return PARAM2;
	}
	public void setPARAM2(List<Data> pARAM2) {
		PARAM2 = pARAM2;
	}
}
