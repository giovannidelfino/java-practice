package day20_forloop;

public class WeekDays {
	public static void main(String[] args) {
		//for loop : 1-7
		// 1 - Monday
		
		for (int i = 0; i <= 7; i++) {
			switch(i) {
			case 1:
				System.out.println(i+" - Monday");
				break;
			case 2:
				System.out.println(i+" - Tuesday");
				break;
			case 3:
				System.out.println(i+" - Wednesday");
				break;
			case 4:
				System.out.println(i+" - Thursday");
				break;
			case 5:
				System.out.println(i+" - Friday");
				break;
			case 6:
				System.out.println(i+" - Saturday");
				break;
			case 7:
				System.out.println(i+" - Sunday");
				break;
			}
		}
	}
}
