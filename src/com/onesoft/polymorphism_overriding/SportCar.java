package com.onesoft.polymorphism_overriding;

public class SportCar extends Car {
	float weight;
	public String showSpeed(int cc) {
		if(cc==200) {
			return "Speed is 180";
		}
		else if(cc==300) {
			return "Speed is 240";
		}
		else {
			return "Speed is 280";
		}
	}

}
