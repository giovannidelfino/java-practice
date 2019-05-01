package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 */
		
		String stairs = "*";
		
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
		}
		
	}
}
