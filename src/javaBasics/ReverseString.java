package javaBasics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse = reverse + inputStr.charAt(i);
		}

		System.out.println("Reversed string is: " + reverse);
		read.close();
	}
}