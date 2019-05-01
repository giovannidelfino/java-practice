package day24;

public class WarmUp_Task {
	public static void main(String[] args) {
		/*
		char letter = 'a';
		while(letter <='z') {
			System.out.print(letter+""+letter+ " "); 
			letter++;
		}
		System.out.println(" ");
		*/
		
		for (char i = 'a'; i <= 'e'; i++) {
			for (char var = 'a'; var<= 'e'; var++) {
				System.out.print(i);
				System.out.println(var);
			}
		}
	}
}
