package day28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFood {
	public static void main(String[] args) throws IOException {
	/*
	 * 	read all data and assign to array
	 */
	String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
	System.out.println("Data size: " +data.length);
	
	}
}
