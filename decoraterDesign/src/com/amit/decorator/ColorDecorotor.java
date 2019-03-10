package com.amit.decorator;

public class ColorDecorotor extends HouseDecorater{
	
	public ColorDecorotor(House house){
		super(house);
	
	}
	public String makeHouse(){
		return house.makeHouse()+ " Color";
	}

}
