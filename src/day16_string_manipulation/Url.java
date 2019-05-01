package day16_string_manipulation;

import java.util.Scanner;

public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a URL");
		String url = scan.next();
		
		//check www.
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
		int lastDotIndex = url.length() -4;
		
		/*
		if (url.charAt(url.length() -4) == '.') {
			System.out.println("");
		}
		*/
		
		String domain = url.substring(4, lastDotIndex);
		System.out.println("Domain: " +domain);
		
		String extension = url.substring(lastDotIndex+1);
		System.out.println("Extension: " +extension);
	}
}
