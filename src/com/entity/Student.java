package com.entity;

public class Student {
	private String name;
	private double marks;
	private int rollno;
	
	public Student() {
		
	}
	
	public Student(String name,double marks,int rollno) {
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	
	public int getRollNo() {
		return this.rollno;
	}
	
}
