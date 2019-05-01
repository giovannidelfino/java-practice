package day28;

public class StringWithLoops {
	public static void main(String[] args) {
		String day = "Monday";
		//check number of chars
		System.out.println(day.length());
		if(day.length() >= 6) {
			System.out.println("Possibly a valid day");
		}else {
			System.out.println("Days are normally 6 chars or longer!");
		}
		//compare strings
		String today = "Monday"; //created in string pool
		if(day.equals(today)) {
			System.out.println("Today is Monday");
		}else {
			System.out.println("Wrong day");
		}
		
		if(	day.equals("Monday") || 
			day.equals("Friday") ||
			day.equals("Sunday")) 
		{
			System.out.println("Definitely a valid day");
		}else {
			System.out.println("Invalid day!");
		}
		
		//Monday --> check if last 3 chars are "day"
		//endsWith method
		if(day.endsWith("day")) {
			System.out.println("It ends with 'day'");
		}else {
			System.out.println("Does not end with 'day'");
		}
		//substring --creates a partial string
		if(day.substring(3).contentEquals("day")) {
			System.out.println("last 3 chars are day");
		}else {
			System.out.println("Last 3 are not day");
		}
		
		String myDay = "Saturday";
		System.out.println(myDay.substring(3));
		System.out.println(myDay.substring(1,5));
		System.out.println(myDay.length());
		System.out.println(myDay.substring(5));
		
	}
}
