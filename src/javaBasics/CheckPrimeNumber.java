package javaBasics;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
		read.close();
	}

}