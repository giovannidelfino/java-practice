package day23;
import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		String expectedUsername = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		
		do {
			if(attempts == 0) {
				System.out.println("You have exceeded number of attempts.");
				System.out.println("This user has been deactivated for 30min.");
				return;
			}
			attempts--;
			System.out.println("Please enter username:");
			username = scan.next();
				if(!username.contentEquals(expectedUsername)) {
					System.out.println("Wrong username.");
					System.out.println("Attempts left: " +attempts);
				}
				else {
					System.out.println("Please enter password:");
					password = scan.next();
				}
		} while(!username.equals(expectedUsername) || !password.equals(expectedPassword));
			
		System.out.println("Login successful!");
		}
	}

