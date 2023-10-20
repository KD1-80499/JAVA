package com.beam;

import java.util.Scanner;

public class calculator {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);

	}

	public static void main(String[] args) {

		int choice;
		double num1, num2;

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 nos");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			System.out.println("0.Exit");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			choice = new Scanner(System.in).nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				calculate(num1, num2, (x, y) -> x + y);
				break;

			case 2:

				calculate(num1, num2, (x, y) -> x - y);
				break;

			case 3:
				calculate(num1, num2, (x, y) -> x * y);
				break;

			case 4:
				calculate(num1, num2, (x, y) -> x / y);
				break;

			}

		} while (choice != 0);
	}

}
