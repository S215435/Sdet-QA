
public class MissingNumberInAnArray {

	public static void main(String[] args) {
		int a1[] = {1,2,4,5};
		
		// 1+2+4+5 = 12  sum1
		// 1+2+3+4+5 = 15  sum2
		// sum2 - sum1 = 15-12 = 3 missing number
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<a1.length; i++) {
			sum1 = sum1 + a1[i];
		}
		
		System.out.println("The sum of a1 is " + sum1);
		
		for(int i = 1; i<=5; i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("The sum of a2 is " + sum2);
		
		int missingNum = sum2 - sum1; 
		System.out.println("Missing number is: " + missingNum);
		
	}

}
