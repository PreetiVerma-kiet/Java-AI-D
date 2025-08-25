package com.student;

 public class Student {
	String Name;
	String Department;
	int RollNo;
	int Age;
	
	static String Collegename="KIET";
	public Student(String Name,String Department, int RollNo, int Age ) {
		this.Name=Name;
		this.Department=Department;
		this.RollNo=RollNo;
		this.Age=Age;
	}
	public Student() {
		this.Name=null;
		this.Department=null;
		this.RollNo=0;
		this.Age=0;
	}
	
	public void studying(int No_of_hours) {
		System.out.println("The student" +Name+"is studing for"+No_of_hours);
	}
	public void readAndwrite() {
		System.out.println("the student can read and write");
	}
	public void displayInfo() {
		System.out.println("Student name is"+Name+",Age is"+Age+",RollNo is"+RollNo+"and Department is"+Department);
	}
	public void payFee() {
		System.out.println("The student"+Name+"paid the tution fee");
		}
	

}
