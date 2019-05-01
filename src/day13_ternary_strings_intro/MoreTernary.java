package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "good";
		int rating = (quality.contentEquals("good")) ? 100 : 0 ;
		
		System.out.println("Rating: " +rating);
		
		int pmHour = 6;
		
		// rush hour during evening: 4 = 7		
		boolean rushHour = (pmHour >= 4 && pmHour <= 7) ? true : false;
		System.out.println(pmHour+ "pm is rush hour? " + rushHour);
		
		String result = rushHour == true ? "yes" : "no";
		System.out.println(pmHour+ "pm is rush hour? " + result);
		
		
		int amHour = 8; //6-9
		
		String amRushHour = amHour >= 6 && amHour <= 9 ? "Yes" : "No";
			System.out.println(amHour+ "am is rush hour? " +amRushHour);
	}
}
