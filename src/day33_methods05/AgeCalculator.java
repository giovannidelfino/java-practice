package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		int age = calculateAge(2010);
		System.out.println("Your are " +age+ " year old.");
		
	}
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if(age < 0) {
			System.out.println("Invalid Age!");
			return 0;
		} else if (age >= 0 && age <= 14) {
			System.out.println("child");
		}else if (age >=15 && age <= 25) {
			System.out.println("youngster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
		} else{ 
			System.out.println("senior");
		
		}
		return age;
	}
	
}
