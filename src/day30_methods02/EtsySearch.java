package day30_methods02;

public class EtsySearch {
	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
		
		
	}
	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
		System.out.println();
	}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden spoon' into search field");
		System.out.println("Click on 'Search' button");
		System.out.println();
	}
	public static void printResults() {
		System.out.println("Wooden spoon (1,258 results)");
		System.out.println();
	}
	
}
