package controller;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner((System.in));

		System.out.println("Enter your name: ");
		String s1 = scan.nextLine();
		System.out.println("Your name is " + s1);

		System.out.println("Your name City ");
		String s2 = scan.nextLine();
		System.out.println("City name is " + s2);

		System.out.println("Enter whole Number ");
		int x = scan.nextInt();

		System.out.println("enter um valor Double ");
		Double y = scan.nextDouble();

		System.out.println("O numero " + x + " e " + y + " o produto é " + (x * y));
		scan.close();

	}

}
