package Repl_it_Assignments;
import java.util.*;
public class TeacherInstructions {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    int wordLength = word.length();
	    
	    if (word.length() %2 != 0) {
	      if(wordLength >= 3){
	      System.out.println(word.charAt(wordLength/2));
	      }
	      else if (wordLength == 0){
	      System.out.println(word+word+word);
	      }
	    }  
	    else {
	      if(wordLength >= 4) {
	      System.out.println(word.substring(((wordLength/2)-1),(wordLength/2)));  
	      }
	      else if (wordLength == 2) {
	      System.out.println(word+word);  
	      }
	    }
	  }
}
