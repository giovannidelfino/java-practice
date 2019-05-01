package Repl_it_Assignments;

import java.util.Scanner;

public class A_075 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.charAt(0) == 'x' || word.charAt(0) == 'X') {
	      System.out.print(word.substring(1, word.length()-1));
	    } else {
	      System.out.print(word.substring(0, word.length()));
	    }
	    
	    if(word.charAt(word.length()-1) == 'x' || word.charAt(word.length()-1) == 'X') {
	      System.out.print("");
	    } else {
	      System.out.print(word.charAt(word.length()));
	    }
	  }
}
