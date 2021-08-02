package com.bridgelabz.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookSimulator {
	HashMap<String, AddressBookMain> booksMap = new HashMap<>();

	/**
	 * main method
	 */
	public static void main(String[] args) {
		ScannerForUserInput scannerForUserInput = new ScannerForUserInput();
		AddressBookSimulator addressBookSimulator = new AddressBookSimulator();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Select options: \n1.Add Book\n2.AccessBook\n3.Search Contact by First/LastName \n4.Search contact by city/state \n5.Find number of contacts \n6.Exit");
			int option = scannerForUserInput.scannerInitializer().nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the Name of New book");
				String bookName = scannerForUserInput.scannerInitializer().nextLine();
				addressBookSimulator.booksMap.put(bookName, new AddressBookMain());
				break;
			case 2:
				System.out.println("Enter the name of book to access it");
				Object bookName1 = scannerForUserInput.scannerInitializer().nextLine();
				if (addressBookSimulator.booksMap.containsKey(bookName1)) {
					AddressBookMain contactManager = addressBookSimulator.booksMap.get(bookName1);
					contactManager.accessContact();
				}
				break;
			case 3:
				System.out.println("Enter the City/State Name to Search person  ");
				String contactName = scannerForUserInput.scannerInitializer().nextLine();
				addressBookSimulator.booksMap.entrySet().forEach(entry -> {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue().getPersonList().stream()
											.filter(person -> person.getFirst_Name().equals(contactName) || person.getLast_Name().equals(contactName))
											.findFirst().orElse(null));
				});
				break;
			case 4:
				System.out.println("Enter the city/state name to search");
				String placeName = scannerForUserInput.scannerInitializer().nextLine();
				addressBookSimulator.booksMap.entrySet().forEach(entry -> {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue().getPersonList().stream()
							.filter(person -> person.getCity().equals(placeName) || person.getState().equals(placeName))
							.findFirst().orElse(null));
				});
				break;
			case 5:
				System.out.println("Enter the city/state name to search number of contacts");
				String placeName2 = scannerForUserInput.scannerInitializer().nextLine();
				addressBookSimulator.booksMap.entrySet().forEach(entry -> {
					System.out.println(entry.getKey());
					System.out.println("same cities or states: " + entry.getValue().getPersonList().stream().filter(
							person -> person.getCity().equals(placeName2) || person.getState().equals(placeName2))
							.count());
				});
				break;
			default:
				isExit = true;
				System.out.println("Thanks for using Address Book Simulator!");
				scannerForUserInput.scannerInitializer().close();
			}
		}
	}
}