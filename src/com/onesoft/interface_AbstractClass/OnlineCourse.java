package com.onesoft.interface_AbstractClass;

public class OnlineCourse implements Course {
	public String showUrl(String link) {
		return "Url link "+link;
	}
	public String showCourseId(int id) {
		return "Id is "+id;
	}
	public void showCourseName(String courseName) {
		if(courseName.equalsIgnoreCase("Java")) {
			System.out.println("Fees is 20000");
		}else if(courseName.equalsIgnoreCase("python")) {
			System.out.println("Fees is 25000");
		}else if(courseName.equalsIgnoreCase("Ethnic technical")) {
			System.out.println("Fees is 30000");
		}else if(courseName.equalsIgnoreCase("Sql")) {
			System.out.println("Fees is 35000");
		}
	}
	public String showTrainer(String trainer) {
		return "Trainer in "+trainer;
	}
	/*public String showCourseFees(int price) {
		return "Fees is "+price;
	}*/
	
	

}
