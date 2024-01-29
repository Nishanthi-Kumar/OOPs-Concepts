package com.onesoft.interface_AbstractClass;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher teacher=new Teacher();
	
		System.out.println(teacher.workRole("Teacher"));
		System.out.println(teacher.salary(20000));
		System.out.println(teacher.degree("B.Ed"));
	}

}
