package day23;

public class Arrays1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];

		int num1 = 5;
		int num2 = 7;
		int num3 = 10;

		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;

		numbers[1] = 'A';

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("*****************");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		byte[] bytesArray = new byte[Integer.MAX_VALUE - 5];

		String[] names = new String[3];
		// size = to number of items
		String[] names2 = { "Shaun", "Roman", "Vlad" };

		System.out.println(names2[2]);
		System.out.println("Number of items: " + names2.length);
		String[] countries = { "" };
		// double[] values =
		// array has fixed size
		countries[0] = "USA";
		// String name = null;
		String[] fruits = new String[] { "apple, orange" };
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
