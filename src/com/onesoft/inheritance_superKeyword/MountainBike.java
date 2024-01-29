package com.onesoft.inheritance_superKeyword;

public class MountainBike extends Bike {
	int climbingSpeed;
	float weight;
	
	public MountainBike(String brand,int price,int model,int climbingSpeed, float weight) {
		super(brand,price,model);
		this.climbingSpeed = climbingSpeed;
		this.weight = weight;
	}
	
	public String toString() {
		return climbingSpeed+" "+weight+" "+super.toString() ;
	}
	

}
