//Natural Number which is greater than 1
//Which has only two factors, 1 and itself
//19 = 1 and 19 - prime number
//28 = 1,2,4,7,14 and 28 - not a prime number

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		int num = 13;
		int count = 0;
		
		if(num > 1) {
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a prime number");
			}
		}else {
			System.out.println("Not a palindrome number");
		}
	}

}
