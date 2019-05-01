package day16_string_manipulation;
import java.util.*;
public class Replace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String sentence = "My name is [Enter Name]";
		
		System.out.println(sentence);
		String myName = scan.nextLine();
		
		
		
		System.out.println(sentence.replace ("[Enter Name]" , myName));
		
	}
	
}
