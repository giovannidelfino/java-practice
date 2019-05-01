package day20_forloop;

public class EvenOrOdd {
	public static void main(String[] args) {
	
		for(int n = 1; n <= 100; n++) {
			if(n % 2 == 0) { // check if even number
			System.out.print(n+" ");
			}
		}
		
		System.out.println(" ");
		for(int j = 1; j <= 100; j++) {
			if(j % 2 != 0) { // check if odd number
			System.out.print(j+" ");
			}
		}
		
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) {
				sumOfEvens += num;
			}
			else {
				sumOfOdds += num;
			}
		}
		System.out.println();
		System.out.println("Sum of evens: "  +sumOfEvens);
		System.out.println("Sum of odds: " +sumOfOdds);
}
}
