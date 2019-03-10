package com.amit.decorator;

public abstract class HouseDecorater implements House{
	House house;
	HouseDecorater(House house){
		this.house =house;
		
	}
	public String makeHouse(){
		return house.makeHouse();
	}

}
