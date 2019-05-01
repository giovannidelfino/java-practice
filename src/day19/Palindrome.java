package day19;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word to test:");
		String word = scan.next();
		String reversed = "";
		
		/*loop through word in reverse order and
		 * concatenate each character to reverse string
		 */
		
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
			
		}
		System.out.println(reversed);
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("It is a Palendrome");
		}
		else {
			System.out.println("It is not Palendrome");
		
		}
	}
}
