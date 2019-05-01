package day27;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	//searches for a value in the array and returns index.
	int [] nums = {4, 6, 7, 10, 55};
	System.out.println(Arrays.binarySearch(nums,  7));
	System.out.println(Arrays.binarySearch(nums,55));
	System.out.println(Arrays.binarySearch(nums,5));
	
	int i = Arrays.binarySearch(nums, 10);
	System.out.println(i);
	
	int[] nums2 = {40, 6, 17, 10, 55};
	System.out.println(Arrays.binarySearch(nums2, 40));
	
	
}
}
