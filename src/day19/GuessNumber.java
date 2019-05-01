package day19;
import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("### WELCOME TO GUESS NUMBER GAME ###");
		int guessNumber;
		int secretNumber = random.nextInt(101);
		
		
	do {
		System.out.println("Guess the number:");
		guessNumber = scan.nextInt();
		if(guessNumber<secretNumber) {
			System.out.println("too small");
		}
		else if (guessNumber>secretNumber) {
			System.out.println("Too large");
		}
	}
	while(guessNumber != secretNumber); 
			System.out.println("Bingo! Congrats, you won!");
		
	}
}
