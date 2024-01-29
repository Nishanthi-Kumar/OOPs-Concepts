package com.onesoft.constructor_toString;

public class UseComputer {
	public static void main(String[] args) {
		Computer c=new Computer(500,false);
		c.setBrand("Sample");
		System.out.println(c.getBrand());
	}

}
