package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});
		int[] myNums = new int[] {3,4,5,6,7,3,42,2,5,45,46,6,5,3};
		printArray(myNums);
		
		int[] one = {10,2,3};
		int[] two = {3,1,4,323,100};
		print2Arrays(one,two);
		
	}
	public static void printArray(int[] nums) { //nums = myNums
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void print2Arrays(int[] arrNums1, int[] arrNums2) {
		if(arrNums1.length > arrNums2.length) {
			System.out.println(Arrays.toString(arrNums1));
			System.out.println(Arrays.toString(arrNums2));
		} else {
			System.out.println(Arrays.toString(arrNums2));
			System.out.println(Arrays.toString(arrNums1));
		}
		System.out.println();
	}
	
}

	