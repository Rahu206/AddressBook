package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	List<Contact> contacts = new ArrayList<Contact>();

	public void update(Contact contact) {
		Contact [] contacts = new Contact[1];
		contacts[0] = contact ;

		for(int i=0;i<contacts.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name to edit: ");
			String firstName = sc.nextLine();
			if(contacts[i].getFirstName().equals(contact.firstName)) {
				Contact c = contacts[i];
				c.setFirstName(firstName);
				contacts[i] = c;
			}
		}

		for(int i = 0; i<contacts.length;i++) {
			System.out.println(contacts[i]);
		}
	}

	public void add(Contact contact) {
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
