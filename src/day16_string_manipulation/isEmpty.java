package day16_string_manipulation;

public class isEmpty {
public static void main(String[] args) {
	String userName = " ";
	String password = " ";
	System.out.println(userName.isEmpty());
	
	if (userName.isEmpty()) {
        System.out.println("Username can not be empty.");
    } else {
        System.out.println("Username is not empty");
    }
    
    if (userName.isEmpty() || password.isEmpty()) {
        System.out.println("Username and password can't be empty!");
    } else {
        System.out.println("Username or password is not empty!");
    }
	
	}
}

