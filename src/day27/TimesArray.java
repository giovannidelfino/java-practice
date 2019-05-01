package day27;

public class TimesArray {
	public static void main(String[] args) {
		int[] time1 = new int[2]; //0,0 by default
		int[] time2 = new int[2]; //0,0 by default
		int t=5;
		System.out.println(t);
		
		//System.out.println(time1[0]); //0
		time1[0] = 10;
		time1[1] = 15;
		
		time2[0] = 16;
		time2[1] = 10;
		
		//before comparing, check if both arrays have valid hour/minute
		if(time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if(time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if(time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if(time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		//compare arrays and tell which one is earlier
		if(time1[0] < time2[0]) {
			System.out.println("Time1 earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		} else {
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("Same Time!");
			}
		}
	}
}
