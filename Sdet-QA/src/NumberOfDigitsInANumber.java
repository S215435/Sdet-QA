// Number-14589, Number of Digits-5

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 14589;
		int count = 0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Number of digits = " + count);
	}

}
