package com.repository;

import java.util.Scanner;

import com.entity.Student;

public class MyDB {
	public static Student[] database;
	public static int  index = 0;
	
	static {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		
		database  = new Student[size];
	}
	
}
