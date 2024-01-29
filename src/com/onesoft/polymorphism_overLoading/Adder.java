package com.onesoft.polymorphism_overLoading;

public class Adder {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public long add(int num1,long num2) {
		return num1+num2;
	}
	public long add(long num1,long num2) {
		return num1+num2;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Adder add=new Adder();
		System.out.println(add.add(2,3));
		System.out.println(add.add(98765432109l, 98995322677l));
	}

}
