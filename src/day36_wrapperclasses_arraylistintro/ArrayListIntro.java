package day36_wrapperclasses_arraylistintro;
import java.util.ArrayList;
public class ArrayListIntro {
	public static void main(String[] args) {
		//create array list
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		System.out.println("Names array: " +names);
		System.out.println("Names count: " +names.size());
		
	}
}
