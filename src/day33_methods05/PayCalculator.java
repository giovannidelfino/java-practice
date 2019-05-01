package day33_methods05;

public class PayCalculator {
	public static void main(String[] args) {
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " +pay);
		System.out.println(getHourlyPay(0, 10));
		System.out.println();
		int noPay = getHourlyPay(10,0);
		System.out.println("NoPay: " +noPay);
		
	}
	public static int getHourlyPay(int hours, int rate) {
		if(hours <= 0) {
			System.out.println("INVALID HOURS");
			return 0;
		}
		
		if (rate <= 0) {
			System.out.println("INVALID RATE");
			return 0;
		}
		
		int totalPay = hours * rate;
		return totalPay;
		
		
		
		
	}
	
	
}