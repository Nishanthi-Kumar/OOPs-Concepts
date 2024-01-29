package com.onesoft.interface_AbstractClass;

public class UseOnlineClass {
	public static void main(String[] args) {
		OnlineCourse oc=new OnlineCourse();
		System.out.println(oc.showCourseId(234));
		oc.showCourseName("java");
		System.out.println(oc.showTrainer("Java"));
		//System.out.println(oc.showCourseFees(2000));
	}

}
