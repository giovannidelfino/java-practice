package day30_methods02;

import java.util.Random;

public class MyNumbers {
	public static void main(String[] args) {
	// int showMe5Numbers[] = {233, 22, 236, 556, 669};
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		
		
	}
	public static void showMe5Numbers() {	
		Random r = new Random();
		for(int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001)+" ");
		}
		System.out.println();	
		
	}
}
