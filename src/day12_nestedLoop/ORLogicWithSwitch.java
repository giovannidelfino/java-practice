package day12_nestedLoop;

public class ORLogicWithSwitch {
	public static void main(String[] args) {
		char grade = 'D';
		//A, B, C -> Pass D, E -> Fail  Invalid grade
		switch (grade){
		  case 'A':
		  case 'B':
		  case 'C':
		    System.out.println("Pass");
		    break;
		  case 'D':
		  case 'E':
		    System.out.println("Failed");
		    break;
		  default:
		    System.out.println("Invalid Grade");
	}
}
}