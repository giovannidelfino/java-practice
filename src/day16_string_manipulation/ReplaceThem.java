package day16_string_manipulation;

public class ReplaceThem {
public static void main(String[] args) {
	/*
	String sentence = "Coding is fun, it is my hobby!!";
	String withNoSpaces = sentence.replace(" ", "");
	
	System.out.println(sentence);
	System.out.println(withNoSpaces);
	
	chaining
	mixed = mixed.replace("x", "").replace("y", "").replace("z", "");
	*/
	
	String sentence2 = "jnlanlva rpp gooool";
	String mixedChar = "nl";

	sentence2 = sentence2.replace(mixedChar, "");
	
	System.out.println(sentence2);
	
	sentence2 = sentence2.substring(0, sentence2.indexOf(" "));
	System.out.println(sentence2);
	}
}
