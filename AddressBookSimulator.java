package com.bridgelabz.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookSimulator {
	private static HashMap<String, AddressBookMain> booksMap = new HashMap<>();

	/**
	 * main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Select options: \n1.Add Book\n2.AccessBook\n3.Search Contact \n4.Exit");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the Name of New book");
				Scanner scanner1 = new Scanner(System.in);
				String bookName = scanner1.nextLine();
				booksMap.put(bookName, new AddressBookMain());
				break;
			case 2:
				System.out.println("Enter the name of book to access it");
				Scanner scanner2 = new Scanner(System.in);
				String bookName1 = scanner2.nextLine();
				if (booksMap.containsKey(bookName1)) {
					AddressBookMain bookManager = booksMap.get(bookName1);
					bookManager.accessContact();
					bookManager.getPersonList();
				}
				break;
			case 3:
				System.out.println("Enter the name to search");
                Scanner scanner3 = new Scanner(System.in);
                String name = scanner3.nextLine();
                System.out.println(booksMap.values().stream().flatMap(book -> book.getPersonList().stream()
               		 .filter(person -> person.getState().equals(name) || person.getCity().equals(name)))
               		 .collect(Collectors.toList()));
                break;
			default:
				System.out.println("Thanks for using Address Book Simulator!");
				isExit = true;
				scanner.close();
			}
		}
	}

}
