package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		
		while(letter <='z') {
			System.out.print(letter+ " "); 
			letter++;
			Thread.sleep(250);
		}
		
		System.out.println(" ");
		
		char capitals = 'A';
		
		while(capitals <='Z') {
			System.out.print(capitals+ " "); 
			capitals++;
			Thread.sleep(250);
		}
		
		System.out.println(" ");
		
		 char reverse = 'z';
		 while(reverse >= 'a') {
			 System.out.print(reverse+ " ");
			 reverse--;
			 Thread.sleep(250);
		 }
		
	}
}
