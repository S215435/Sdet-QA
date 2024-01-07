
public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		// First step inside the loop is to extract the last digit of the number
		while(num>0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		
		System.out.println("The sum of digits in a number is " + sum);
	}

}
