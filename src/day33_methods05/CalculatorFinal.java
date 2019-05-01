package day33_methods05;

public class CalculatorFinal {
	public static void main(String[] args) {
		addVoid(2, 5);
		System.out.println();
		int result = add(4,8);
		System.out.println("Result: " +result);
	}
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " +sum);
	}
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	public static double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	public static double divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("ERROR: cannot divide by cero");
			return 0;
		} else {
		double result = num1 / num2;
		return result;
		}
	}
}
