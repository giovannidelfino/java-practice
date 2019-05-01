package day06_operators2;
import java.util.Scanner;
public class ScannerYourName {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, what is your name?");
		
		String firstName = input.next(); //accept String input
		
		System.out.println("Nice to meet you, " + firstName);

		System.out.println("Which city do you live in?");
		
		String city = input.next(); //accept String input
		
		System.out.println(city + " is a nice city.");
		
		
		
		
	}
}
