package day15_string_manipulation;

public class IndexOf2 {
public static void main(String[] args) {
	//index of with two inputs
	
	String list = "html-selenium-angular-jenkins-grid";
	int firstDash = list.indexOf("-");
	System.out.println("First dash: " + firstDash);
	
	int secondDash = list.indexOf("-" , 5);
	System.out.println("Second dash: " +secondDash);
	
	int thirdDash = list.indexOf("-" , 14);
	System.out.println("Third dash: " +thirdDash);
	
	int lastDash = list.lastIndexOf("-");
	System.out.println("Last dash : " +lastDash);
	}
}
