package com.bridgelabz.addressbook;

import java.util.Scanner;

public class TestAddressBook {

	
	public static void main(String args[]) {
		Contact contact1 = new Contact1();
		
		System.out.println("Welcome to Address Book");
		
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Add");
		System.out.println("Press 2 for Update");
		System.out.println("Press 3 for Delete");
		
		int option = sc.nextInt();
		switch(option) {
			case 1: addressBook.add(contact1);
					break;
			case 2: addressBook.update(contact1);
					break;
			case 3:addressBook.delete(contact1);
					break;
			
			default: System.out.println("Enter valid option: ");
		}		
		//addressBook.add(contact1);
		//addressBook.update(contact1);
		addressBook.print();
			
		}
	}
	
	
	
	
	
	
