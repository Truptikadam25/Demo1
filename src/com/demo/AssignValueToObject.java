package com.demo;

import java.util.Scanner;

public class AssignValueToObject{
static void Student()throws CloneNotSupportedException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter empid");
	int empid=sc.nextInt();
	System.out.println("Enter empname");
	String empname=sc.next();
	System.out.println("Enter empsalary");
	
	int empsalary =sc.nextInt();
	emp e1=new emp(empid,empname,empsalary);
	System.out.println("e1===="+e1);
	emp e2=(emp)e1.clone();
	System.out.println("e2====="+e2);
}
	public static void main(String[] args)throws CloneNotSupportedException  {
		Student();
	}
	
	}
class emp implements Cloneable {
	int empid;
	String empname;
	int empsalary;
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public emp(int empid, String empname, int empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}