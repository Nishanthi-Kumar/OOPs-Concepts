package com.onesoft.polymorphism_overriding;

public class UseActionMovie {
	public static void main(String[] args) {
		ActionMovie am=new ActionMovie();
		System.out.println(am.fightSquence(4));
	}

}

class Movie {
	public String fightSquence(int fight) {
		if(fight==2) {
			return "Fights in that Movie";
		}
		else if(fight==3) {
			return "Fights,Nrml action Movie";
		}
		else if(fight==4) {
			return "Fights";
		}else {
			return "";
		}
	}
}

class ActionMovie extends Movie {
	public String fightSquence(int fight) {
		if(fight==2) {
			return "Fights are ok in that Movie";
		}
		else if(fight==3) {
			return "Nrml action Movie";
		}
		else if(fight==4) {
			return "Full packed Action Movie";
		}else {
			return "";
		}
	
	}

}