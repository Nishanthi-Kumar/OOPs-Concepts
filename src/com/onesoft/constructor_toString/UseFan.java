package com.onesoft.constructor_toString;

public class UseFan {
	public static void main(String[] args) {
		Coil coil=new Coil("Vguard",800,"Normal");
		System.out.println(coil);
		
		Fan fan=new Fan("Whirlpool",999,coil);
		System.out.println(fan);
		/*System.out.println(fan);
		System.out.println(fan.getBrand());*/
		
				
	}

}
