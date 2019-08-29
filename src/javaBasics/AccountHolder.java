package javaBasics;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	double accounBalance;
	boolean eligibileForCreditCard;
	static String staticVariable;// static variable

	// static method
	public static int staticMethod(int credit) {
		return credit;
	}

	// abstract class
	abstract class abstractClass {
		abstract void disp(); // this abstract method can be removed which is currently inside abstract class

		void display() {

		}
	}
	
	abstract class yio extends abstractClass{
		void diso(){
			
		}
	}

	// non static method
	public int nonStaticMethod(int creditNo) {
		return creditNo;
	}

	// Default Constructor
	public AccountHolder() {
		System.out.println("I am a default Constructor");
	}

	public static void recursive() {
		recursive();
	}

	// Constructor overloading
	public AccountHolder(int x, int y) {
		System.out.println("I am in Constructor overloading");

	}

	// Getter and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAccounBalance() {
		return accounBalance;
	}

	public void setAccounBalance(double accounBalance) {
		this.accounBalance = accounBalance;
	}

	public boolean isEligibileForCreditCard() {
		return eligibileForCreditCard;
	}

	public void setEligibileForCreditCard(boolean eligibileForCreditCard) {
		this.eligibileForCreditCard = eligibileForCreditCard;
	}

	public void testeligibilityForCreditCard() {
		if (age > 25 && accounBalance >= 20000) {
			eligibileForCreditCard = true;
		}
	}

}
