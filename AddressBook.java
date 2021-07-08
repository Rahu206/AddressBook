package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	List<Contact> contacts = new ArrayList<Contact>();
	public void addContact(Contact contact) {
		
		contacts.add(contact);
	}
	public void delete(Contact contact) {
		contacts.remove(contact);
	}
	
	public void print() {
		for(Object contact1 : contacts) {
			System.out.println(contact1);
		}
	}
}	
