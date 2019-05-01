package day13_ternary_strings_intro;
import java.util.*;

public class CarSelector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What type of car are you interested in?");
		System.out.println("1) American\n2) Japanese\n3) German\n4) Italian\n5) Korean");
		int carType = scan.nextInt ();
		
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		
		
		switch (carType) {
		
		case 1: 
			carOrigin = "American";
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			break;
		case 2:
			carOrigin = "Japanese";
			averagePrice = 32000;
			carOptions = "Toyota, Mitsubishi, Honda, Subaru, Mazda";
			break;
		case 3: 
			carOrigin = "German";
			averagePrice = 55000;
			carOptions = "BMW, VW, Audi, Mercedes, Porsche";
			break;
		case 4: 
			carOrigin = "Italian";
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			break;
		case 5:
			carOrigin = "Korean";
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			break;
		default:
			System.out.println("Car type not available.");
			return;
		}
		System.out.println("You selected " +carOrigin+ " car and your options are " +carOptions+ ".");
		System.out.println("Average Price: $" +averagePrice);
	}
}
