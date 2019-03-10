package com.amit.Singleton;

public enum Singleton {
	INSTANCE;
	private int value;

	public int getValue() {
		return value;

	}
	
	public void setValue(int value){
		this.value=value;
		
	}

}
