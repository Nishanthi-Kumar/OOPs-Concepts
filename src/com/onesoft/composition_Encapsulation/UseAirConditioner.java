package com.onesoft.composition_Encapsulation;

public class UseAirConditioner {
	public static void main(String[] args) {
		Compressor com=new Compressor();
		com.setBrand("Vgaurd");
		com.setPrice(1200);
		com.setCapacity(60);
	    AirConditioner air=new AirConditioner();
	    air.setBrand("Whirlpool");
	    air.setPrice(20000);
	    air.setType("CoolAC");
	    air.setCompressor(com);
	    
	    System.out.println(air.getPrice());
		
		
		
		
	}

}
