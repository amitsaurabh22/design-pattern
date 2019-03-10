package com.amit.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		House house = new LightDecorator(new ColorDecorotor(new SimpleHouse()));
		System.out.println(house.makeHouse());

	}

}
