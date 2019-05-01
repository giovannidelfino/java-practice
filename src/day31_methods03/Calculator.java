package day31_methods03;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		
		System.out.println("Enter operator: | + | - | * | / |");
		String operator = scan.next();
		
		switch (operator) {
			case "+":
				add(num1, num2);
				break;
			case "-":
				subtract(num1, num2);
				break;
			case "*":
				multiply(num1, num2);
				break;
			case "/":
				divide(num1, num2);
				break;
			default:
			return;
		}
	}
		
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " +result);
		
	}
	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: " +result);
		
	}
	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: " +result);
	}
	public static void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("Cannot divide by zero");
			return;
		} else {
		double result = num1 / num2;
		System.out.println("Result: " +result);
		}
	}
}
