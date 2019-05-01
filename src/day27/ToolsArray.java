package day27;

public class ToolsArray {
public static void main(String[] args) {
	
	String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
	
	for(String tool : tools) {
		switch(tool.toLowerCase()) {
			case "java":
				System.out.println("Programming Language");
				break;
			case "selenium":
				System.out.println("Test Automation");
				break;
			case "testing":
				System.out.println("Unit Tests");
				break;
			case "junit":
				System.out.println("Unit Test");
				break;
			case "cucumber":
				System.out.println("BDD Style Testing");
				break;
			case "git":
				System.out.println("Version Control");
				break;
			case "maven":
				System.out.println("Building an Execution for Project");
				break;
			default:
				System.out.println("Unknown tool");
				break;
			}
	}
}
}
