package day16_string_manipulation;

public class Concat {
public static void main(String[] args) {
	String word = "java";
	System.out.println(word.concat("+selenium"));
	System.out.println(word.concat(" in eclipse"));
	
	System.out.println(word+ "\n");
	
	word = word.concat("+Eclipse");
	System.out.println(word);
	
	word = word.concat(" Automation");
	System.out.println(word);
	
	word = word + "-Cucumber";
	System.out.println(word);
	
	word = word + 123;
	System.out.println(word);
	
	word = word + true;
	System.out.println(word);
	
	String word2 = "Hi";
	word2 = word2.concat("-hey").concat("-how are you").concat("-I am fine");
	System.out.println(word2);
}
}
