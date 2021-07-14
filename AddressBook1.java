package com.bridgelabz.addressbook11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook1 {
	List<Contact> contacts = new ArrayList<Contact>();

	public void update() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to edit: ");
		String firstName = sc.nextLine();
		

		for(int i=0;i<contacts.size();i++) 
			{
			if(contacts.get(i).getFirstName().equals(firstName)) {
				Contact c = contacts.get(i);
				c.setFirstName(firstName);
				contacts.add(c);
			}
		}
		for(int i = 0; i<contacts.size();i++) {
			System.out.println(contacts.get(i));
		}
	}

	public void add() {
		@SuppressWarnings("unused")
		Contact contact1 = new Contact1 ();
	}

	public void delete() {
		@SuppressWarnings("unused")
		Contact contact1 = new Contact ();
	}

	public void print() {
		for(Contact contact1 : contacts) {
			System.out.println(contact1);
		}
	}
}	


