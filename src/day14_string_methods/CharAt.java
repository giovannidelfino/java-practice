package day14_string_methods;
import java.util.*;
public class CharAt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = "Computer";
		
		System.out.println(word.charAt(0)); 
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		
		//String word2 and check if first character is 'J'
		
		String word2 = "Java";
		
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		}
		else {
			System.out.println("J is not the first char");
		}
		
		//String word3 that consists of 5 characters
		//check if first and last char are same,
		//true => "First and last match"
		//false => "First and last are different"
		
		/*
		String word3 = scan.next();
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if(first == last) {
			System.out.println("first and last match");
		}
		else {
			System.out.println("do not match");
		}
		*/
		
		String word4 = "jfijsk";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of " +word4+ " is " +lastChar);
		
		
	}
}
