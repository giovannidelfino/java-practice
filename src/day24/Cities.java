package day24;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev", 
							"Annandale", "Moscow", 
							"Istambul", "Baku", "miami"};
		System.out.println(cities.length);
		//TASK print all cities that start with M
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].toUpperCase().startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		for(String city: cities) {
			if(city.toUpperCase().startsWith("M")) {
				System.out.println(city);
			}
		}
		
		
	}
}
