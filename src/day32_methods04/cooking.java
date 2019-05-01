package day32_methods04;

public class cooking {
	public static void main(String[] args) {
		makePancakes();
	}
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");

	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" +dish.toUpperCase()+ "RECIPE~~" );
		
		
	}
	public static void add(String ing) {
		System.out.println("Add " +ing);
	}
	public static void mix(int seconds) {
		System.out.println("Mix for " +seconds+ " seconds.");
	}
	public static void boil(int minutes) {
		System.out.println("Boil it for " +minutes+ " minutes.");
	}
	public static void fry(int minutes) {
		System.out.println("Fry it for " +minutes+ " minutes.");
	}
}
