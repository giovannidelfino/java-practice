package Repl_it_Assignments;
import java.util.Scanner;
public class FindUsername {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    
	    System.out.println("Enter full name:");
	    String username = scan.nextLine();
	    
	    if (username.equalsIgnoreCase("Max Payne") || username.equalsIgnoreCase("Alan Wake")) {
	      System.out.println("User found!");
	    }
	    else {
	      System.out.println("User not found!");
	    }
	    
	  }
	}

