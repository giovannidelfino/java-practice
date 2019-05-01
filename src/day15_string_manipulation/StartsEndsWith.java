package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		//startsWith == test if string starts with another
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		
		System.out.println(word1.startsWith("E"));
		
		String name = "Mr. Jackson";
		//startsWith == test if string starts with another
		
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if (name.startsWith("Mrs.")){
			System.out.println("married woman");
		}else if (name.startsWith("Ms.")){
			System.out.println("single woman");
		}else if (name.startsWith("Dr.")){
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("no available status");
		}

	}
}
