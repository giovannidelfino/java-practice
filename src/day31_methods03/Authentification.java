package day31_methods03;

import java.util.Scanner;

public class Authentification {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Username:");
	String username = scan.next();
	System.out.println("Enter Password:");
	String password = scan.next();
	login(username, password);
	
		
	}
	public static void login(String username, String password) {
		
	String	validUsername = "mentoring@cybertekschool.com";
	String	validPassword = "mentor001";
		
	if (validUsername.equalsIgnoreCase(username) && validPassword.equalsIgnoreCase(password)) {
		System.out.println("Login Successful!");
		System.out.println("Welcome to Okta");
	} else {
		System.out.println("Login failed, try again.");
	}
		
		
	}	
}
