package day23;
import java.util.*;
public class CalculateSum {
	public static void main(String[] args) {
		/*let's write a program, to calculate a sum of 6 numbers
		 * if numbers are less or equals to 0, ignore this
		 * we need to ask user to provide a number
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i = 0; i<3; i++) {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if(num<=0) {
				continue;
			}
			sum+=num;
		}
		System.out.println("Total sum :" +sum);
	}
}
