package com.student;

 public class Student {
	String Name;
	protected String Department;
	int RollNo;
	public int Age;
	
	static String Collegename="KIET";
	public Student(String n,String D, int R, int A ) {
		this.Name=n;
		this.Department=D;
		this.RollNo=R;
		this.Age=A;
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
		//System.out.println("Student name is"+name+",Age is"+Age+",RollNo is"+RollNo+"and Department is"+Department);
	}
	public static void main(String args[]) {
		Student student1=new Student();
		Student student2 = new Student("Rohan","AI", 1, 19);
		student1.displayInfo();
		student2.displayInfo();
		
		//System.out.println("collegeName is  "+student1.Collegename);
		//Student.Collegename="ABES";
		//student1.Collegename="AKG";
		//System.out.println("collegeName is  "+student2.Collegename);
		//student1.Department="AIML";
	}

}
