package day21;

import java.util.Scanner;

public class day21_loops_practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter word");
		String word = scan.next();
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println(i);
			System.out.println(word.charAt(i));
		}
	}
}
