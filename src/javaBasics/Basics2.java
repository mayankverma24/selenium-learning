package javaBasics;

import java.util.Scanner;

public class Basics2 {

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		Scanner read = new Scanner(System.in);

		if (read.hasNextInt()) {
			System.out.println("Integer number");
		}
		else
		{
			System.out.println("Not an Integer");
		}
		read.close();
	}
}