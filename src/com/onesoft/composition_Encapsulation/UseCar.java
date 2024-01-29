package com.onesoft.composition_Encapsulation;

public class UseCar {
	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.brand="ford";
		engine.price=2500;
		engine.enginecc=300;
		
		Car car=new Car();
		car.brand="Bmw";
		car.price=200000;
		car.engine=engine;
		
		System.out.println(car.engine.price);
	}

}
