package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	ScannerForUserInput scannerForUserInput = new ScannerForUserInput();
	List<Person> personList = new ArrayList<>();// contains all person details

	/**
	 * Initializes Person class when new person is added
	 */
	public Person initializer() {
		Person person = new Person();
		return person;
	}

	@Override
	public String toString() {
		return "AddressBookMain{" + "personList = " + personList + '}';
	}

	/**
	 * to get all the list of contacts in one book
	 */
	public List<Person> getPersonList() {
		return personList;
	}

	/**
	 * to remove person from list
	 * 
	 * @param person object of Person class
	 */
	public void deleteContact(Person person) {
		personList.remove(person);
		System.out.println(personList);
	}

	/**
	 * edits the person details of selected name
	 */
	public void editDetails() {
		try (Scanner scanner1 = new Scanner(System.in)) {
			System.out.println("Select option:" + "\n" + "1.First Name" + "\n" + "2.Last Name" + "\n" + "3.Address"
					+ "\n" + "4.City" + "\n" + "5.State" + "\n" + "6.Email" + "\n" + "7.ZIP" + "\n" + "8.Phone Number"
					+ "\n" + "9.Exit");

			switch (scannerForUserInput.scannerInitializer().nextInt()) {
			case 1:
				System.out.println("Enter First Name to change: ");
				Person.setFirst_Name(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 2:
				System.out.println("Enter Last Name to change: ");
				Person.setLast_Name(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 3:
				System.out.println("Enter New address to change: ");
				Person.setAddress(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 4:
				System.out.println("Enter New City to change: ");
				Person.setCity(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 5:
				System.out.println("Enter New state to change: ");
				Person.setState(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 6:
				System.out.println("Enter new Email to change: ");
				Person.setEmail(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 7:
				System.out.println("Enter new ZIP to change: ");
				Person.setZIP(scannerForUserInput.scannerInitializer().nextInt());
				break;
			case 8:
				System.out.println("Enter new Phone Number to change: ");
				Person.setPhone_Number(scannerForUserInput.scannerInitializer().nextLong());
				break;
			default:
				System.out.println("Thank you!");
			}
		}

		System.out.println(personList);
	}

	/**
	 * takes details from the user and adds them to the Person. Then adds the Person
	 * to the list
	 */
	public void addContact() {
		Person person = initializer();

		System.out.println("Enter First Name");
		Person.setFirst_Name(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter Last Name");
		Person.setLast_Name(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter Address");
		Person.setAddress(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter City");
		Person.setCity(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter State");
		Person.setState(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter Email");
		Person.setEmail(scannerForUserInput.scannerInitializer().nextLine());
		
		System.out.println("Enter ZIP");
		Person.setZIP(scannerForUserInput.scannerInitializer().nextInt());
		
		System.out.println("Enter Phone Number");
		Person.setPhone_Number(scannerForUserInput.scannerInitializer().nextLong());

		personList.add(person);
		System.out.println(personList);
	}

	/**
	 * to access the book
	 */
	public void accessContact() {
		boolean isExit = false;
		while (!isExit) {
			System.out.println(
					"Select option: \n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Find Contact \n5.Exit");
			int option = scannerForUserInput.scannerInitializer().nextInt();
			switch (option) {
			case 1:
				if (!isPersonExist(getName())) {
					addContact();
				} else {
					System.out.println("Person already exists!");
				}
				break;
			case 2:
				if (isPersonExist(getName())) {
					editDetails();
				} else {
					System.out.println("Person does not exists!");
				}
				break;
			case 3:
				String name = getName();
				if (isPersonExist(name)) {
					Person person = search(name);
					deleteContact(person);
				}
				break;
			case 4:
				findContactOptions();
				break;
			default:
				System.out.println("Thanks!");
				isExit = true;

			}

		}
	}

	/**
	 * finds the contact of a person by it's name, city or state
	 */
	private void findContactOptions() {
		System.out.println("Select the option: \n1.Find by contact Name\n2.Find by City/State\n3.Exit");
		int option = scannerForUserInput.scannerInitializer().nextInt();

		switch (option) {
		case 1:
			String name1 = getName();
			if (isPersonExist(name1)) {
				Person person = search(name1);
				System.out.println("Contact " + name1 + ": " + person);
			} else {
				System.out.println("Person does not exists!");
			}
			break;
		case 2:
			String name2 = getCityOrStateName();
			if (isCityOrStateExist(name2)) {
				Person person = searchByCityOrState(name2);
				System.out.println("Contact from city/state " + name2 + ": " + person);
			} else {
				System.out.println("City/State does not exists!");
			}
			break;
		default:
			System.out.println("Thank you!");
		}
	}

	/**
	 * asks the user for name and returns it
	 *
	 * @return person name
	 */
	private String getName() {
		System.out.println("Enter person name to Search Contact");
		return scannerForUserInput.scannerInitializer().nextLine();
	}

	/**
	 * asks the user for name and returns it
	 *
	 * @return name of city/state
	 */
	private String getCityOrStateName() {
		System.out.println("Enter the City/State Name to Search Contact");
		return scannerForUserInput.scannerInitializer().nextLine();
	}

	/**
	 * To find if person exists or not
	 *
	 * @param name first or last name of the person
	 * @return true/false
	 */
	private boolean isPersonExist(String name) {
		return personList.stream().anyMatch(personElement -> personElement.getFirst_Name().equals(name)
				|| personElement.getLast_Name().equals(name));
	}

	/**
	 * checks the list for city/state
	 * 
	 * @param name city/state name given by user
	 * @return true/false
	 */
	private boolean isCityOrStateExist(String name) {
		return personList.stream().anyMatch(
				personElement -> personElement.getCity().equals(name) || personElement.getState().equals(name));
	}

	/**
	 * To search the person
	 *
	 * @param name first or last name of the person
	 * @return object of the Person (Person it self)
	 */
	private Person search(String name) {
		Person foundPerson = personList.stream()
				.filter(contact -> contact.getFirst_Name().equals(name) || contact.getLast_Name().equals(name))
				.findFirst().orElse(null);
		return foundPerson;
	}

	/**
	 * To search the person according to it's state and city
	 * 
	 * @param name city or state of the person
	 * @return object of the Person (Person it self)
	 */
	private Person searchByCityOrState(String name) {
		Person foundPerson = personList.stream()
				.filter(person -> person.getState().equals(name) || person.getCity().equals(name)).findFirst()
				.orElse(null);
		return foundPerson;
	}
}
