package day15_string_manipulation;
	import java.util.*;
public class EmojiShortcuts {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter an emoji, we will tell you the meaning:");
	String emoji = scan.next();
	
	char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	
	if (first == ':') {
		if (second == ')') {
			System.out.println("smile");
		}
		else if (second == '(') {
			System.out.println("sad");
		}
		else if (second == '/') {
			System.out.println("upset");
		}
		else if (second == 'p') {
			System.out.println("playful");
		}
		else {
			System.out.println("Unknown emoji");
		}
	}
	else if (second == ':') {
		if (first == ')') {
			System.out.println("sad");
		}
		else if (first == '(') {
			System.out.println("smile");
		}
		else {
			System.out.println("Unknown emoji");
		}
	}
	
	}
}

