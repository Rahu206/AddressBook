package com.bridgelabz.collection;

public class Person {
	private static String First_Name;
	private static String Last_Name;
	private static String Address;
	private static String City;
	private static String State;
	private static String Email;
	private static int ZIP;
	private static long Phone_Number;

	public String getFirst_Name() {
		return First_Name;

	}

	@Override
	public String toString() {
		return "Person [getFirst_Name()=" + getFirst_Name() + ", getLast_Name()=" + getLast_Name() + ", getAddress()="
				+ getAddress() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getEmail()="
				+ getEmail() + ", getZIP()=" + getZIP() + ", getPhone_Number()=" + getPhone_Number() + "]";
	}

	public static void setFirst_Name(String First_Name) {
		Person.First_Name = First_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public static void setLast_Name(String Last_Name) {
		Person.Last_Name = Last_Name;
	}

	public String getAddress() {
		return Address;
	}

	public static void setAddress(String Address) {
		Person.Address = Address;
	}

	public String getCity() {
		return City;
	}

	public static void setCity(String City) {
		Person.City = City;
	}

	public String getState() {
		return State;
	}

	public static void setState(String State) {
		Person.State = State;
	}

	public String getEmail() {
		return Email;
	}

	public static void setEmail(String Email) {
		Person.Email = Email;
	}

	public int getZIP() {
		return ZIP;
	}

	public static void setZIP(int ZIP) {
		Person.ZIP = ZIP;
	}

	public long getPhone_Number() {
		return Phone_Number;
	}

	public static void setPhone_Number(long Phone_Number) {
		Person.Phone_Number = Phone_Number;
	}

}
