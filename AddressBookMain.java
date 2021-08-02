package com.bridgelabz.collection.sort;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.collection.Person;
import com.bridgelabz.collection.ScannerForUserInput;

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
	 * to get all the list of persons in one book
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
		Person person = search(getName());
		if (person != null) {
			System.out.println("Select option:" + "\n" + "1.first name" + "\n" + "2.last name" + "\n" + "3.address"
					+ "\n" + "4.city" + "\n" + "5.state" + "\n" + "6.email" + "\n" + "7.zip" + "\n" + "8.phone number"
					+ "\n" + "9.exit");
			switch (scannerForUserInput.scannerInitializer().nextInt()) {
			case 1:
				System.out.println("Enter new first name to change: ");
				Person.setFirst_Name(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 2:
				System.out.println("Enter new last name to change: ");
				Person.setLast_Name(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 3:
				System.out.println("Enter new address to change: ");
				Person.setAddress(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 4:
				System.out.println("Enter new city to change: ");
				Person.setCity(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 5:
				System.out.println("Enter new state to change: ");
				Person.setState(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 6:
				System.out.println("Enter new email to change: ");
				Person.setEmail(scannerForUserInput.scannerInitializer().nextLine());
				break;
			case 7:
				System.out.println("Enter new zip to change: ");
				Person.setZIP(scannerForUserInput.scannerInitializer().nextInt());
				break;
			case 8:
				System.out.println("Enter new phone number to change: ");
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

		System.out.println("Enter first name");
		Person.setFirst_Name(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter last name");
		Person.setLast_Name(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter address");
		Person.setAddress(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter city");
		Person.setCity(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter state");
		Person.setState(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter email");
		Person.setEmail(scannerForUserInput.scannerInitializer().nextLine());

		System.out.println("Enter zip");
		Person.setZIP(scannerForUserInput.scannerInitializer().nextInt());

		System.out.println("Enter phone number");
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
					"Select option: \n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Find contact\\\n5.Exit");
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
				} else {
					System.out.println("Person does not exist");
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
		System.out.println("Select the option: \n1.find by contact name\n2.find by city/state\n3.exit");
		int option = scannerForUserInput.scannerInitializer().nextInt();

		switch (option) {
		case 1:
			String name1 = getName();
			if (isPersonExist(name1)) {
				Person person1 = search(name1);
				System.out.println("Person " + name1 + ": " + person1);
			} else {
				System.out.println("Person does not exists!");
			}
			break;
		case 2:
			String name2 = getCityOrStateName();
			if (isCityOrStateExist(name2)) {
				Person person = searchByCityOrState(name2);
				System.out.println("Person from city/state " + name2 + ": " + person);
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
		System.out.println("Enter person name");
		return scannerForUserInput.scannerInitializer().nextLine();
	}

	/**
	 * asks the user for name and returns it
	 *
	 * @return name of city/state
	 */
	private String getCityOrStateName() {
		System.out.println("Enter city/state name");
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
