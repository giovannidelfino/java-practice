package day30_methods02;

import java.util.Scanner;

public class rangePrint {
	public static void main(String[] args) {
		rangePrint();
		
		
		
	}	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First, enter a number from 1 to 10:");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number from 1 to 10:");
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i + " ");
			}
		} else if (num1 > num2){
			for(int k = num1; k>= num2; k--) {
				System.out.println(k + " ");
			}
		} else {
			System.out.println(num1);
		}
	
		
	}
}
