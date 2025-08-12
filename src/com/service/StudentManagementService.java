package com.service;

import java.util.Scanner;

public class StudentManagementService {
	public static void startApplication() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\t********** Student Campus Connect App **********");
			System.out.println("\t\t1. Add Student\n\t\t2. Read All Students\n\t\t3. Read Student By RollNo\n\t\t4. Exit");
			System.out.println("\n\t\tEnter Your Choice : ");
			
			if(sc.hasNextInt()) {
				int choice = sc.nextInt();
				if(choice == 1) {
					StudentDatabaseOperations.addStudent(sc);
				}
				else if(choice == 2) {
					StudentDatabaseOperations.readAllStudents();
				}
				else if(choice == 3) {
					System.out.println("Enter Searching Student Roll Number : ");
					int rollno = sc.nextInt();
					StudentDatabaseOperations.readStudent(rollno);
				}
				else if(choice == 4) {
					System.out.println("\t\tExiting....\n\t\tThank You.");
					break;
				}
			}else {
				System.out.println("Invalid Input ! Please Select 1, 2 or 3");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
