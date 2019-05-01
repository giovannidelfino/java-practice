package day31_methods03;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
	
	
	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter idx to countUp");
	int inputNum = scan.nextInt();
		countUp(inputNum);
		countDown(inputNum);
	}
	public static void countUp(int idx) {
		
		for (int i = 1 ; i <= idx ; i++) {
		System.out.print(i+ " ");
		}
	System.out.println();
	}
	public static void countDown(int idx) {
		
		for(int i = idx; i >= 1; i--) {
			System.out.print(i+ " ");
		}
	System.out.println();
	}
}
