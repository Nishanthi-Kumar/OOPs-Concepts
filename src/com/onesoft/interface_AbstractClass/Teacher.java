package com.onesoft.interface_AbstractClass;

public class Teacher implements Employee {
	public String workRole(String role) {
		return "Role is "+role;
	}
	public String salary(int price) {
		return "Salary is "+price; 
	}
	public String degree(String degree) {
		return "Degree is "+degree;
	}
	

}
