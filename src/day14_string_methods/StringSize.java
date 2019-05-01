package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		//check if it matches "Good Morning" and print match
		//or Not match
		if(str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not Match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}
		else {
			System.out.println("Not Match = ignore case");
		}
		
		
		//convert to all uppercase and print
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " +str1);
		
		
		//combine both methods
		if(str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("Chained methods: match");
		}
		else {
			System.out.println("Chained methods: do not match");
		}
		
		String myName = "Murodil";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: " +length);
		
		
		// username must be exactly 8 characters.
		
		String userName = "giovanni";
		
		if (userName.length() == (8)) {
			System.out.println("valid username");
		}
		else {
			System.out.println("invalid username, must be 8 characters");
		}
		}
		
	}

