package day32_methods04;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: " +i);		
		String n = "Maria";
		System.out.println(n);
		
	}
	public static int giveMe10$() {
		System.out.println("return 10 from method");
		return 10;
	}
	public static String giveMeYourName() {
		return "Maria";
		
	}
}