package day23;
import java.util.*;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 2; i < number; i++) {
			if (number% i == 0) {
				System.out.println((number+ " this is not a prime number"));
				return;
			
			}
		}
		System.out.println("This is a prime number.");
	}
}
