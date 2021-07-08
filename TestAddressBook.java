package com.bridgelabz.addressbook;


public class TestAddressBook {

	
	public static void main(String args[]) {
		Contact contact1 = new Contact1();
		
		System.out.println("Welcome to Address Book");
		
		AddressBook addressBook = new AddressBook();
			 addressBook.add(contact1);
		addressBook.print();
			
		
		}
	}
	
	
	
	
	
	
