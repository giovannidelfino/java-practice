package day26;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length);
		System.out.println(wordsArray[0]);
		System.out.println(Arrays.toString(wordsArray));
		
		for(String word : wordsArray) {
			System.out.println(word);
		}
		String diceResult = "1 - 2 of 1,461 positions";
		//using split method, print 1,461
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search result total: " +diceArray[4]);
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] iSplit = sentence.split("I");
		
		for(String w : allWords) {
		System.out.print(w+ ", ");
		}
		System.out.println("\n");
		for(String h : happySplit) {
			System.out.print(h+ ", ");
		}
		System.out.println("\n");
		for(String i : iSplit) {
			System.out.print(i+ ", ");
		}
		System.out.println("\n");
		String word = "java";
		char[] charArray = word.toCharArray();
		for(char ch : charArray) {
			System.out.println(ch);
		}
	} 
}
