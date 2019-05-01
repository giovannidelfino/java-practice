package day29;

import java.util.Arrays;

public class Capitals {
	public static void main(String[] args) {
		String[][] countriesArray = {	{"USA", "Washington DC"},		//0
										{"Canada", "Ottawa"},			//1
										{"Mexico", "Mexico City"},		//2
										{"Brasil", "Brasilia"},			//3
										{"Peru", "Lima"},				//4
										{"Argentina", "Buenos Aires"},	//5
										{"Bolivia", "La Paz"},			//6
										{"Macedonia", "Scopia"},		//7
										{"Kazakhastann", "Nursultan"}	//8
										};
										
		//String[][] c = new String[][]
		
		System.out.println(countriesArray[0][0] + " | " +countriesArray[0][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		
		for(int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] +" | ");
		}
		
		System.out.println();
		
		for(String[] country : countriesArray) {
			System.out.print(country[0] +" | ");
		}
		System.out.println();
		
		//get all the cities and add to cities[] array
		String[] cities = new String[countriesArray.length];
		
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		} System.out.print(Arrays.toString(cities));
		
		System.out.println();
		//look for Bolivia in the countriesArr and test if capital city is "La Paz"
		for(int row = 0 ; row < countriesArray.length ; row++) {
			if(countriesArray[row][0].equals("Bolivia"))
			
				if(countriesArray[row][1].equals("La Paz")) {
				System.out.println("Bolivia test passed");
				}else {
				System.out.println("Bolivia test failed");
				}
				break;
		}
	
	}
}
