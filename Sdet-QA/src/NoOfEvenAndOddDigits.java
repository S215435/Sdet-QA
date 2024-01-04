// Number-123456, No of odd digits = 3, No of even digits = 3

public class NoOfEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 1234567;
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			int rem = num%10;
			if(rem%2 ==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num = num/10;//to eliminate the last obtained digit which is the remainder // very important remember this
		}
		
		System.out.println("Number of odd digits: " + oddCount);
		System.out.println("Number of even digits: " + evenCount);
	}

}
