package com.onesoft.polymorphism_overriding;

public class UseSportCar {
	public static void main(String[] args) {
		Car sc=new SportCar();
		sc.brand="Yamaha";
		sc.price=175000;
		//sc.weight=135.6f;
		System.out.println(sc.showSpeed(300));
	}

}
