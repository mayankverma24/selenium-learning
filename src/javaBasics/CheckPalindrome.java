package javaBasics;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		String inputStr = read.nextLine();
		String reverse = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse = reverse + inputStr.charAt(i);
		}
		if (reverse.equalsIgnoreCase(inputStr)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not a Palindrome");
		}
		read.close();
	}

}
