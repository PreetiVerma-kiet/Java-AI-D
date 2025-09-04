package com.student;

public class RegularStudent extends Student{
	int attendance_per;
	String class_room;
	
	public RegularStudent(String Name,String Department, int RollNo, int Age, int attendance_per, String class_room) {
		super(Name,Department,RollNo,Age );
		this.attendance_per=attendance_per;
		this.class_room=class_room;	
	}
	public RegularStudent() {
		
	}
	public void payFee() {
		System.out.println("the student"+getName()+"paid the tution fee + Library fee + Lab fee");
	}
	
	

}
