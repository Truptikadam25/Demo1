package com.demo1;

import java.util.Scanner;

public class AssignValueToObject1  {
static void Student() throws CloneNotSupportedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Studentid");
	int Studentid=sc.nextInt();
	System.out.println("enter Studentname");
	String Studentname=sc.next();
	System.out.println("enter StudentMark");
	int StudentMark=sc.nextInt();
	Employee e1=new Employee(Studentid,Studentname,StudentMark);
	System.out.println("e1====="+e1);
	Employee e2=(Employee)e1.clone();
	System.out.println("e2==="+e2);


}
public static void main(String[] args) throws CloneNotSupportedException {
	Student();
}






}










class Employee {
	
	int Studentid;
	String Studentname;
	int StudentMark;
	@Override
	public String toString() {
		return "Employee [Studentid=" + Studentid + ", Studentname=" + Studentname + ", StudentMark=" + StudentMark
				+ "]";
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public int getStudentMark() {
		return StudentMark;
	}
	public void setStudentMark(int studentMark) {
		StudentMark = studentMark;
	}
	public Employee(int studentid, String studentname, int studentMark) {
		super();
		Studentid = studentid;
		Studentname = studentname;
		StudentMark = studentMark;
	}
	
	
	
	
	
	
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}	


}

