package day23;
import java.util.*;
public class ConcatinateWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		String allWords = "";
		String word = "";
		
		for(int i = 0; i<6; i++) {
			System.out.println("Enter word #" +(i+1)+ ":");
			word = scan.next();
			if(word.contentEquals("java")) {
				continue;
			}
			allWords+=word + ", ";
		}
		System.out.println(allWords);
		
		
		
	}
}
