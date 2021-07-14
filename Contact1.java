package com.bridgelabz.addressbook11;

import java.util.Scanner;

public class Contact1 extends Contact {
	public Contact1() {
		
		
		Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome to Address Book");
	
	System.out.println("Enter your first name: ");
	this.firstName = scanner.nextLine();
	
	System.out.println("Enter your last name : ");
	this.lastName =scanner.nextLine();
	
	System.out.println("Enter your Address : ");
	this.address = scanner.nextLine();
	
	System.out.println("Enter your city name : ");
	this.city = scanner.nextLine();
	
	System.out.println("Enter your state name : ");
	this.state = scanner.nextLine();
	
	System.out.println("Enter your email: ");
	this.email = scanner.nextLine();
	
	System.out.println("Enter your zipcode: ");
	this.zipCode = scanner.nextInt();
	
	System.out.println("Enter your phone number: ");
	this.phoneNumber = scanner.nextLong();
	
	
	}
}