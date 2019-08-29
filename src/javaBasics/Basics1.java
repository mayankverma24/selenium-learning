package javaBasics;

public class Basics1 {
	static final double piValue = 3.14;

	public static void main(String[] args) {

		// This step prints in the output
		System.out.println("I started Java learning.");

		// Add 2 numbers
		int a = 2;
		int b = 5;
		int c = a + b;
		System.out.println("Sum is " + c);
		// Basics1 obj1 = new Basics1();
		// System.out.println(piValue);
		System.out.println("Start another class");
		//Basics1 obj1 = new Basics1();
				
		//obj1.Datatypes();
		Datatypes();
		System.out.println("End another class");
		

	}

	static void Datatypes() {
		long bigLong = 15000000000L;
		System.out.println(bigLong);

		float bigFloat = 5.75f;
		System.out.println(bigFloat);

		double bigDouble = 343.92384283823D;
		System.out.println(bigDouble);

		char randomChar = 65;
		System.out.println(randomChar);
		int randomNumber = Math.min(88, 8);
		System.out.println(randomNumber);
		
	}

}
