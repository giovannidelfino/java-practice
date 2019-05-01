package day27;

public class CanvasCourses {
	public static void main(String[] args) {
		String url = "https://learn.cybertekschool.com/courses/149";
		
		//split by "/" and store into array
		String[] urlArr = url.split("/");
		System.out.println("Length: " +urlArr.length);
		//get the last value and convert it to integer. Integer.parseInt(...) -> int value
		System.out.println(urlArr[urlArr.length - 1]);
		int courseID = Integer.parseInt(urlArr[4]);
		//switch statement and find the matching
		switch(courseID) {
			case 147:
				System.out.println("Java Programming");
				break;
			case 204:
				System.out.println("Mentoring Sessions");
				break;
			case 149:
				System.out.println("SDLC");
			break;
			case 152:
				System.out.println("QA Testing");
			break;
			case 144:
				System.out.println("Team activity");
			break;
			case 143:
				System.out.println("Welcome Kit");
			break;
		}
		
	}
}
