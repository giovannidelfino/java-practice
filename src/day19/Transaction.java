package day19;
import java.util.*;
public class Transaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance = 0;
		double addBalance = 0;
		String strip = "======";
		int count = 0;
		
		System.out.println("Welcome to Venmo!\nTo start, enter an amount to add funds to your account:");
		balance = scan.nextDouble();
		System.out.println("Thank you! Your current balance is $" +balance+ ". \nStart your first transfer!\n" +strip);
		
		while(balance >0) {
			count++; //increase transaction by 1
			System.out.println("Transfer #" +count+ ": \nEnter an amount to send:");
			double transaction = scan.nextInt();
			if(transaction > balance) {
				System.out.println("DECLINED:\nYour balance is " +balance+ ". Try a lower amount.\n" +strip);
			} else if(transaction == balance) {
				System.out.println("ATTENTION:\nZero balance.\nAdd funds to continue.");
				System.out.println("Enter an amount to add funds:");
				balance = scan.nextDouble();
				System.out.println("Transfer Successful! \nCurrent balance: $" +balance+ "\n" +strip);
			}	else{
				balance-= transaction;
				System.out.println("Transfer Successful! \nCurrent balance: $" +balance+ "\n" +strip);
		}
			
		}
	}
}
