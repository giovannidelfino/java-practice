package day22_loopspractice2;

public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String word = "including webpages, images";
		
		int length1 = word.length();
		word = word.replace("e",  "");
		int length2 = word.length();
		
		System.out.println("Length1: " +length1);
		System.out.println("Length2: " +length2);
		
		int count = length1 - length2;
		System.out.println("Count of e: " +count);
	}
}
