package day19;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		//now, add 1 to 10
		
		int sum = 0;
		int j = 1;
		do {
			sum = sum + j;
			j++;
		}while(j < 10);
			
		System.out.println(sum);
				
}
}
