package day24;

public class CarShop {
	public static void main(String[] args) {
		
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls Royce"};
		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
	}
		System.out.println("***********************");
		for (String : cars) {
			if (!c.endsWith("a")) {
				continue;
			}
			System.out.println(c);
		}
	}
		System.out.println("***********************");
		for(String b: cars) {
			if(b.endsWith("a")) {
			System.out.println(b);
		}
		}
	}
}
