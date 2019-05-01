package day24;

import java.util.Arrays;

public class SymOfTheNumbers {
	public static void main(String[] args) {
		//create array of integers with length 3
		int[] numbers = new int[3];
		//first value in array
		numbers[0] = 5;
		//second value in array
		numbers[1] = 10;
		//third value in array
		numbers[2] = 20;
		//[I@59f95c5d this is a hash code
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		/* use loop, in order to loop through the array and 
		 * calculate sum of all elements. 
		 * numbers.length --> returns number of elements in the array
		 */
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum: " +sum);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value: " +max);
		
		int min = Integer.MAX_VALUE;
		for(int k = 0; k < numbers.length; k++) {
			if(numbers[k] < min) {
				min = numbers [k];
			}
		}
		System.out.println("Min value: " +min);
	}
}
