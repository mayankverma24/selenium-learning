package javaBasics;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		//AccountHolder henry = new AccountHolder();
		//AccountHolder sarah = new AccountHolder();
		tom.setFirstName("Tom");
		tom.lastName = "Smith";
		tom.age = 36;
		tom.accounBalance = 20000;
		tom.testeligibilityForCreditCard();

		System.out.println("Is Tom eligible for Credit Card: " + tom.eligibileForCreditCard);
		MyFirstMethod(22, 33);

		// Calling static method
		AccountHolder.staticMethod(400);
		System.out.println(AccountHolder.staticMethod(400));

		// Calling non static method- need to create an object of the class
		AccountHolder acc = new AccountHolder();
		acc.nonStaticMethod(400);
		System.out.println(acc.nonStaticMethod(400));
		System.out.println(AccountHolder.staticVariable = "I am a static variable");

	}

	public static void MyFirstMethod(int x, int y) {
		System.out.println("Addition of " + (x) + " + " + (y) + " = " + (x + y));
	}
}
