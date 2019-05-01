package day28;

import java.util.Arrays;

public class Loop2DArrays {
public static void main(String[] args) {
	String[][] pizzas = {
			{"pineapple", "pepperoni"}, //0
			{"anchovies", "mushroom", "olives"}, //1
			{"4 cheese"},//2
			{"chicken", "tomatoes", "jalapenios", "onions"},//3
			{"green peppers", "zuccini", "brocolli", "spinach", "shrimp"}//4
	};
	
	for(String[] pizza : pizzas ) {
		System.out.print(pizza.length+ "-");
		System.out.println(Arrays.deepToString(pizza));
	}
	
	System.out.println("##### FOR LOOP #####");
	for(int i = 0; i < pizzas.length; i++) {
		System.out.print(pizzas[i].length +"-");
		System.out.println(Arrays.deepToString(pizzas[i]));
	}
	
	int[][] students = {{4,5,6},
						{12,5,7},
						{23,56,12,55,3}
						};
	for(int[] group : students) {
		for(int studentID : group) {	
			System.out.print(studentID+ ", ");
		}
		System.out.println();
	}
	
	int[][] nums = {
					{10, 20},
					{20, 30, 40, 50},
					{100, 200, 400},
					{555, 333, 111, 444, 666, 78},
					};
	for(int i = 0; i < nums.length; i++) {
		for(int j = 0; j < nums[i].length; j++) {
			System.out.print(nums[i][j] + " ");
		}
		System.out.println();
	}
}
}


