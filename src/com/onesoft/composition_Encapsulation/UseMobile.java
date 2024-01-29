package com.onesoft.composition_Encapsulation;

public class UseMobile {
	public static void main(String[] args) {
		Battery bat=new Battery();
		bat.setBrand("vivo");
		bat.setPrice(1200);
		bat.setCapacity(80);
		
		Mobile mob=new Mobile();
		mob.setBrand("VIVO");
		mob.setPrice(20000);
		//mob.setBattery(bat);
		
		//System.out.println(mob.getBattery().brand);
		//System.out.println(mob.getBattery().getBrand());
	}

}
