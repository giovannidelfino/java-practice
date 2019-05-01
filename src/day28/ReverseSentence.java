package day28;

public class ReverseSentence {
public static void main(String[] args) {
	/*
	 * Create string variable sentence and assign value
	 * find out and print number of words
	 * reverse the sentence and assign to new string called reversed
	 * print the reverse
	 */
	String sentence = "You are a very interesting person";
	String[] arrSentence = sentence.split(" ");
	
	int count = arrSentence.length;
	System.out.println("Number of words: " +count);
	
	String reversed = "";
	for(int i = arrSentence.length-1; i >= 0; i--) {
		reversed += arrSentence[i] +" ";
		
	}
	reversed = reversed.trim();
	System.out.println(reversed);
	
}
}
