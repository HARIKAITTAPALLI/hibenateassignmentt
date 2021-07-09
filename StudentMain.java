package com.te.HibernateAssignment.bean;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char opt;
		do {
			System.out.println("        Welcome To Student table");
			System.out.println();
			System.out.println("What do you want to perform ");
			System.out.println("1. Read Data of all the Students");
			System.out.println("2. Read Data of particular Student");
			System.out.println("3. Update data of an existing student");
			System.out.println("4. Delete data of a specific Student");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				ReadAllData.readAllData();
				break;
			case 2:
				ReadOneData.readoneData();
				break;
			case 3:
				UpdateData.readupdateData();
				break;
			case 4:
				Delete.readdeleteData();
				break;
			default:
				System.out.println("Invalid Choice ");
				break;
			}
			System.out.println();
			opt = scanner.next().charAt(0);
		} while (opt != 'n');
		System.out.println("\nThank You");
	}

		

	}


