package com.onesoft.polymorphism_overLoading;

public class Maximum {
	public String findMax(int num1,int num2) {
		if(num1>num2) {
			return num1+" is max";
		}
		else {
			return num2+" is max";
		}
	}
	public String findMax(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			return num1+" is max";
		}
		else if(num2>num1&&num2>num3) {
			return num2+" is max";
		}
		else {
			return num3+" is max";
		}
	}
	public String findMax(String val1,String val2) {
		if(val1.length()>val2.length()) {
			return val1+" is max String";
		}
		else {
			return val2+" is max String";
		}
	}

}
