package day16_string_manipulation;
import java.util.*;
public class CapitalCity {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*String str = "Moscow is the capital of Russia";
		//Baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		*/
		
		String email = "firstName_lastName@gmail.com";
		
		String company = "deloitte";
		
		System.out.println("Welcome to Deloitte! \nEnter your first name:");
		String firstName = scan.next();
		
		System.out.println("Now, enter your last name:");
		String lastName = scan.next();
		String fullName = firstName+ " " +lastName;
		
		String newEmail = email.replace("gmail", company).replace("firstName", firstName.toLowerCase()).replace("lastName", lastName.toLowerCase());
		
		System.out.println("Thank you, " +fullName+ "! \nYour new email will be " +newEmail);
		
		
	
	}
}
