package day20_forloop;
import java.util.*;
public class ComputerPrice {

	  public static void main(String[] args) {
	    
		  double price = 0 ;
		  String storageType, screenType, cpu;
		  int ram = 0 ;
			
		  Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	    
	    System.out.println("Select screen size:");
	    String screenSize = scan.next();
	      if (screenSize.equals("13.3")){
	      price = price + 200;
	    } else if (screenSize.equals("15.0")){
	      price = price + 300;
	    } else if (screenSize.equals("17.3")){
	      price = price + 400;
	    }
	    
	    System.out.println("Select CPU type:");
	    String cpuType = scan.next();
	      if (cpuType.equals("i3")) {
	      price = price + 150;
	    } else if (cpuType.equals("i5")) {
	      price = price + 250;
	    } else if (cpuType.equals("i7")) {
	      price = price + 350;
	    }
	    
	    System.out.println("Select RAM size:");
	    ram = scan.nextInt();
	      if (ram%4 ==0 && ram>=4) {
	      price = price + (ram/4)*50;
	    }
	    
	      System.out.println("Select storage type:");
	      storageType = scan.next();
	        if (storageType.equals("HDD")) {
	          System.out.println("Enter memory size:");
	          int memorySize = scan.next();
	          if (memorySize%500 == 0 && memorySize>=500) {
	          price = price + (memorySize/500)*50;
	          }
	          
	  	}
	        else if (storageType.equals("SSD")){
	          System.out.println("Enter memory size:");
	          int memorySize = scan.next();
	          if (memorySize%500 == 0 && memorySize>=500) {
	          price = price + (memorySize/500)*100;
	        }
		}
	      
	      System.out.println("Enter screen resolution:");
	      String screenResolution = scan.next();
	        if (screenResolution.equals("FULLHD")) {
	          price = price + 100;
	        }
	        else if (screenResolution.equals("4K")) {
	          price = price + 200;
	        }
	        
	    System.out.println("Laptop price is: " +price);
	    
	    }
	  }
	
