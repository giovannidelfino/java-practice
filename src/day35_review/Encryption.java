package day35_review;
import java.util.*;
public class Encryption {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		System.out.println("Enter word to encrypt:");
		String word = scan.next().toLowerCase();
		/*
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position: " +position);
		char enChar = encrypted.charAt(position);
		System.out.println(first+ " --> " +enChar);
		*/
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
		}
	}
}
