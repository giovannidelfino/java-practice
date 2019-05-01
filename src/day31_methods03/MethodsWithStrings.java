package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		
	countWords("Java is fun");
	
	}
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in Sentence:" +Arrays.deepToString(words));
		System.out.println("Number of Words: " +words.length);
		
	}
	
}
