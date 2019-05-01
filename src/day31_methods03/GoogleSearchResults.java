package day31_methods03;

public class GoogleSearchResults {
	public static void main(String[] args) {
		
		GoogleSearchResults("About 121,000,000 results (0.75 seconds)");
		
	}
	public static void GoogleSearchResults(String result) {
		
		String[] words = result.split(" ");
		String count = words[1].replace("," , "");
		String seconds = words[3].replace("(" , "");
		
		System.out.println("Results count: " +count);
		System.out.println("Time in seconds: " +seconds);
		
	}
	
	
	
}
