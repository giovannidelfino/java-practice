package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		Scanner input = new Scanner(System.in);
	
		int passingPercentage = 65;
		
		System.out.println("What is your score?");
		int yourScorePercentage = input.nextInt();
		
		if(yourScorePercentage >= 65) {
			System.out.println("You passed!");
		}else {
			System.out.println("You failed!");
		}
		
		}
}
