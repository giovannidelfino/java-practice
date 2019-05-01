package day13_ternary_strings_intro;

import java.util.Scanner;

public class StudentTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		String split = scan.next();
		boolean split1 = (split.equalsIgnoreCase("Yes"))? true : false ;
		
		if (!(split1)) {
			System.out.println("Split: No");
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
		}
		else {
			System.out.println("Split: Yes");
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + (totalPay / numberOfPeople));
			System.out.println("Tip per person: " + (totalTip / numberOfPeople));
		}
		
		
		/*
		System.out.println("Enter the result of 2+2: ");
		int result1 = scan.nextInt ();
		int score1 = 0;
		String grade = "";
		int scoreTotal = 0;
		String gradeOfTotal = "";
		String ifPassed = "";
		
		if (result1 == 4) {
			score1 = 10;
			System.out.println("Correct answer! You got " +score1+ " points!");
		}
		else {
			System.out.println("Wrong answer.");
			score1 = 0;
		}
		
		scoreTotal = (score1 + 10 + 10)/3;
		System.out.println("You have a total of " +scoreTotal+ " points.");
		
		switch (scoreTotal) {
			case 10: 
				gradeOfTotal = "A";
				break;
			default:
				System.out.println("scoreTotal error");
		}
		
		ifPassed = (scoreTotal >= 5 && scoreTotal <= 10) ? "passed" : "failed";
		
		System.out.println("You " +ifPassed+ " with " +gradeOfTotal);
		*/
	}
}
