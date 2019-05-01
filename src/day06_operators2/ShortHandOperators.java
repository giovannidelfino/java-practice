package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		int students = 45;
		students = students + 5;
		System.out.println("Students: " + students);
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		teachers+=2; // increase teachers by 2
		System.out.println("Teachers: " + teachers);
	
		teachers-= 5; //decrease teachers by 5
		System.out.println("Teachers: " +teachers);
		
		int shoes = 20;
		shoes /= 4; // shoes divided by 4, and assigned back to shoes.
		
		System.out.println("Shoes: " +shoes);
		
		
		
	}
	
}
