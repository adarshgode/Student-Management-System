package com.service;

import java.util.Scanner;

import com.entity.Student;
import com.repository.MyDB;

public class StudentDatabaseOperations {
	public static void addStudent(Scanner sc) {
		Student s = new Student();
		System.out.println("Enter Student Name : ");
		s.setName(sc.next());
		
		System.out.println("Enter Your Marks :  ");
		s.setMarks(sc.nextDouble());
		
		System.out.println("Enter Your Roll Number : ");
		s.setRollNo(sc.nextInt());
		
		MyDB.database[MyDB.index++] = s;
	}
	public static void readStudent(int rollno) {
		boolean bool = false;
		for(Student obj : MyDB.database) {
			if(obj != null && obj.getRollNo() == rollno) {
				System.out.println("\t\tStudent Name is : "+obj.getName());
				System.out.println("\t\tStudent Marks is : "+obj.getMarks());
				System.out.println("\t\tStudent Roll No is : "+obj.getRollNo());
				bool = true;
				break;
			}
		}
		if(!bool) {
			System.out.println("Student with this roll no is not present ");
		}
	}
	public static void readAllStudents() {
		for(Student obj : MyDB.database) {
			if(obj != null) {
				System.out.println("\t\tStudent Name is : "+obj.getName());
				System.out.println("\t\tStudent Marks is : "+obj.getMarks());
				System.out.println("\t\tStudent Roll No is : "+obj.getRollNo());
				System.out.println("*************************************************");
			}
		}
	}
}
