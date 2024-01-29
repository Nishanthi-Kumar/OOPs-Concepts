package com.onesoft.inheritance;

public class UseStationaryProduct {
	public static void main(String[] args) {
		Pencil pencil=new Pencil();
		pencil.brand="Absara";
		pencil.price=25;
		pencil.color="Grey";
		pencil.isWood=true;
		System.out.println(pencil.findMax(pencil.price));
	}
}

class StationaryProduct {
	String brand;
	int price;
	
}

class Pencil extends StationaryProduct {
	String color;
	boolean isWood;
	public String findMax(int price) {
		if(price>=20) {
			return "Good";
		}else {
			return "Bad";
		}
	}
}