package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Main extends Contact{
		public Main() {
			Scanner sc = new Scanner(System.in);
			
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
			this.phoneNumber = sc.nextInt();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your email");
			this.email = sc1.nextLine();
		}
		
	}
