package day22_loopspractice2;

public class SubStringPractice {
	public static void main(String[] args) {
		String word = "java";
		
		// print each character in separate line using substring, no loop needed
		
		/*
			System.out.println(word.substring(0,1));
			System.out.println(word.substring(1,2));
			System.out.println(word.substring(2,3));
			System.out.println(word.substring(3,4));
		*/	
			int i = 0;
			
			do {
			System.out.println(word.substring(i, i+1));
			i++;
			} while (i<4);
			
			System.out.println("####### FOR LOOP #######");
			
			for (int n = 0; n <= 3; n++) {
				System.out.println(word.substring(n, n+1));
			}
			System.out.println("####### REVERSE #######");
			
			for (int n = 3; n >= 0; n--) {
				System.out.println(word.substring(n, n+1));
			}
			
			int start = 1;
			int end = 5;
			String word2 = "UnitedStates";
			System.out.println(word2.substring(start, end));
	}
}
