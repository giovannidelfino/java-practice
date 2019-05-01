package day15_string_manipulation;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail.com";
	System.out.println(email.contains("@"));
	
	String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
	//check if apples is in the shopping list
	
	if (list.contains("apples")) {
		System.out.println("Apples are there!");
	}
	else {
		System.out.println("Lets add appes now!");
	}
	
	boolean hasEggs = list.contains("eggs");
	System.out.println("Contains eggs: " +hasEggs);
	
	boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
	System.out.println("Contains cucumbers: " +hasCucumbers);
	
	
	email = "name@yahoo.com";
	
	if(email.contains("@yahoo")) {
		System.out.println("Yahoo account");
	}
	
	String etsyTitle = "Wooden spoon | Etsy";
	if(etsyTitle.contains(" | ")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not detected");
	}
	
	String name = giovanni
			
		
	
}
}
