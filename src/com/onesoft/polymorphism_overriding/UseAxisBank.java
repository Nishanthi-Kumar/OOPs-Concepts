package com.onesoft.polymorphism_overriding;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.name="AxisBank";
		ab.location="Chennai";
		ab.brand="Perungudi";
		ab.ifscCode="ABCD50003427478";
		System.out.println(ab.getLoanInterestAmount(30000));
	}

}

class Bank {
	String name;
	String location;
	String brand;
	String ifscCode;
	public String getLoanInterestAmount(int principleAmount) {
		return "PrincipleAmount= "+(principleAmount*5/100);
	}
}

class AxisBank extends Bank {
	public String getLoanInterestAmount(int principleAmount) {
		return "PrincipleAmountForAxisBank= "+(principleAmount*10/100);
	}
}
