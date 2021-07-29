package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	private static Scanner scanner = new Scanner(System.in);
	List<Person> personList = new ArrayList<>();
	Person person = new Person();

	public void add() {
		System.out.println("Enter your First Name: ");
		person.setFirstName(scanner.next());

		System.out.println("Enter your Last Name: ");
		person.setLastName(scanner.next());

		System.out.println("Enter your address: ");
		person.setAddress(scanner.next());

		System.out.println("Enter your City: ");
		person.setCity(scanner.next());

		System.out.println("Enter your State: ");
		person.setState(scanner.next());

		System.out.println("Enter your Zip: ");
		person.setZip(scanner.nextInt());

		System.out.println("Enter your Phone Number: ");
		person.setPhoneNumber(scanner.nextLong());

		System.out.println("Enter your Email: ");
		person.setEmail(scanner.next());

		personList.add(person);
		System.out.println(personList);

	}

	public static void main(String[] args) {

		AddressBookMain book = new AddressBookMain();
		System.out.println("Welcome to Address Book");

		boolean isExit = false;

		while (!isExit) {
			System.out.println(
					"Enter the option number to perform Operation: \n1:Add\n2:Edit\n3:Delete\n4:Exit\n5:Show Contact");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				book.add();
				break;
			default:
				System.out.println("Invalid option");
			}
		}
	}

}
