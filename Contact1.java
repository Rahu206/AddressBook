package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Contact1 extends Contact{
		public Contact1() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Address Book");
			
			System.out.println("Enter yout first name: ");
			this.firstName = sc.nextLine();
			
			System.out.println("Enter your last name: ");
			this.lastName = sc.nextLine();
			
			System.out.println("Enter your address name: ");
			this.address = sc.nextLine();
			
			System.out.println("Enter your city name: ");
			this.city = sc.nextLine();
			
			System.out.println("Enter your state name: ");
			this.state = sc.nextLine();
			
			System.out.println("Enter your zipcode: ");
			this.zipCode = sc.nextInt();
			
			System.out.println("Enter your phone number: ");
			this.phoneNumber = sc.nextLong();
			
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your email");
			this.email = sc1.nextLine();
			
			
		}
		
	}
