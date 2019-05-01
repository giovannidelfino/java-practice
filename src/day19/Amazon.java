package day19;

public class Amazon {
public static void main(String[] args) {
	String word = "Amazon";
	//print each character one by one in separated lines
	int idx = 0;
	while(idx < word.length()) {
		System.out.println(word.charAt(idx));
		idx++;
	}
	
	int idx2 = word.length() - 1;
	while(idx2 >= 0) {
		System.out.println(word.charAt(idx2));
	}
}
}
