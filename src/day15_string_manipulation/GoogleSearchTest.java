package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " = - Google Search";
		
	if(pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
	}
}

