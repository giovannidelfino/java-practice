package day21;

public class UniqueCharacters {
public static void main(String[] args) {
	String word = "javva";
	String unique = "";
	
	char ch = word.charAt(0);
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique += ch; //unique = unique +ch;
	}
	
	/*
	 * String str = "apple";
	 * str.charAt(0) = a
	 * str.contains("ap" => true
	 * str.indexOf('a') => 0
	 * str.indexOf("ap") => 0
	 * if (str.indexOf(ch) == -1 (not found)
	 * 
	 * 
	 * String word2 = "bananas";
	 * String unique2 = "";
	 * 
	 * int i = 0;
	 * char ch2 = word2.charAt(i);
	 * System.out.println("Ch2:" + ch2);
	 * 
	 * i = 1;
	 * ch2 = word2.charAt(i);
	 */
}
}
