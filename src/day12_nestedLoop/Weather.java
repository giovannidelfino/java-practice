package day12_nestedLoop;
import java.util.*;
public class Weather {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today?");
		
		String weather = scan.next().toLowerCase();
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go out to play!");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Use an umbrella");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Build a snowman");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");
			break;
		
		}
	}
}
