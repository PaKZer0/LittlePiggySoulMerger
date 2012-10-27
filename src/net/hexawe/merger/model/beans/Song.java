package net.hexawe.merger.model.beans;

import java.util.List;

public class Song {
	private List<SongData> SONG;
	private List<ChainData> CHAINS;
	private List<TransposeData> TRANSPOSES;
	private List<NotesData> NOTES;
	private List<InstrumentData> INSTRUMENTS;
	private List<CommandData> COMMAND1;
	private List<ParamData> PARAM1;
	private List<CommandData> COMMAND2;
	private List<ParamData> PARAM2;
	public List<SongData> getSONG() {
		return SONG;
	}
	public void setSONG(List<SongData> sONG) {
		SONG = sONG;
	}
	public List<ChainData> getCHAINS() {
		return CHAINS;
	}
	public void setCHAINS(List<ChainData> cHAINS) {
		CHAINS = cHAINS;
	}
	public List<TransposeData> getTRANSPOSES() {
		return TRANSPOSES;
	}
	public void setTRANSPOSES(List<TransposeData> tRANSPOSES) {
		TRANSPOSES = tRANSPOSES;
	}
	public List<NotesData> getNOTES() {
		return NOTES;
	}
	public void setNOTES(List<NotesData> nOTES) {
		NOTES = nOTES;
	}
	public List<InstrumentData> getINSTRUMENTS() {
		return INSTRUMENTS;
	}
	public void setINSTRUMENTS(List<InstrumentData> iNSTRUMENTS) {
		INSTRUMENTS = iNSTRUMENTS;
	}
	public List<CommandData> getCOMMAND1() {
		return COMMAND1;
	}
	public void setCOMMAND1(List<CommandData> cOMMAND1) {
		COMMAND1 = cOMMAND1;
	}
	public List<ParamData> getPARAM1() {
		return PARAM1;
	}
	public void setPARAM1(List<ParamData> pARAM1) {
		PARAM1 = pARAM1;
	}
	public List<CommandData> getCOMMAND2() {
		return COMMAND2;
	}
	public void setCOMMAND2(List<CommandData> cOMMAND2) {
		COMMAND2 = cOMMAND2;
	}
	public List<ParamData> getPARAM2() {
		return PARAM2;
	}
	public void setPARAM2(List<ParamData> pARAM2) {
		PARAM2 = pARAM2;
	}
}
