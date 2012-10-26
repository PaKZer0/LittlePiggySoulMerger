package net.hexawe.merger.model.beans;

public abstract class A_Data {
	private int value;
	private int length;
	
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
	
	public abstract String toString();
}
