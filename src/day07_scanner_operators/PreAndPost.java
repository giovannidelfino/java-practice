package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
				
			System.out.println("num: " +num);
			System.out.println("num2: " +num2);
				
			num = 10;
			num2 = num++ + 5;
			
			System.out.println("num: " +num);
			System.out.println("num2: " +num2);
			
			int count = 20;
			int count2 = 10;
			
			int totalCount = ++count + --count2;
			
			System.out.println("count: " +count);
			System.out.println("count2: " +count2);
			System.out.println("totalCount: " +totalCount);
			
			int myCount = count++ + ++count;
			System.out.println("count: " +count);
			System.out.println("myCount: " +myCount);
			
	}
}
