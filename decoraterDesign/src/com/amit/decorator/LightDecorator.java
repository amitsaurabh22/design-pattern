package com.amit.decorator;

public class LightDecorator extends HouseDecorater{
	
	public LightDecorator(House house){
		super(house);
	
	}
	public String makeHouse(){
		return house.makeHouse()+ " Light";
	}

}

