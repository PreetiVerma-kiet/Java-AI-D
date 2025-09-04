package com.student;

 public class Student {
	private String Name;
	private String Department;
	private int RollNo;
	private int Age;
	
	private static String Collegename="KIET";
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
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public static String getCollegename() {
		return Collegename;
	}
	public static void setCollegename(String collegename) {
		Collegename = collegename;
	}

}
