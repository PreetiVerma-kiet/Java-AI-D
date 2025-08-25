package com.student;

public class TestStudent {
	public static void main (String[] args) {
		Student s1 = new Student("rohan", "AIML", 67, 20);
		System.out.println("The name of the student is"+s1.Name);
		RegularStudent rs= new RegularStudent("riya", "AI", 90, 19,90, "H703");
		HostelStudent hs = new HostelStudent ("Priya", "AI", 90, 19,90, "H703", "ayra", 309);
		rs.displayInfo();//parent class function
		rs.payFee();
		s1.payFee();
		hs.payFee();
		}
}


