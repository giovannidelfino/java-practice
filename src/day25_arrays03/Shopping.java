package day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Shoes", "Shirt", "Watch", "Bag  ", "Socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		/*System.out.println("Products count: " +products.length);
		
		if (products.length == prices.length && prices.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something wrong in this list");
			return;
		}
		
		for(String prod : products) {
			System.out.println(prod);
		}
		for (int i = 0 ; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		for (int idx = itemsId.length -1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}
		*/

		System.out.println("***Report***");
		int idx = 0;
		double totalPrice = 0.0;
		
		for (idx = 0; idx < products.length; idx++) {
			System.out.println("Item " +(idx+1)+ ": " +itemsId[idx]+ " - " +products[idx] + " - $" +prices[idx]);
		
			totalPrice += prices[idx];
		}
		System.out.println("Total Price: $" +totalPrice);
		System.out.println("-------------");
		int maxIndex= 0;
		double maxPrice = 0;
		
		for(int j = 0; j < prices.length; j++) {
			if(prices[j] > maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		System.out.println("Item " +(maxIndex+1)+ ": " +itemsId[maxIndex] + " - " + products[maxIndex] + " - $" +maxPrice);
	}
}

