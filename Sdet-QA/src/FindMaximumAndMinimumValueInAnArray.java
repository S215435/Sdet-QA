
public class FindMaximumAndMinimumValueInAnArray {

	public static void main(String[] args) {
		int a[] = {50,30,40,10,60,20};
		
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
			}
		}
		
		System.out.println("The maximum value in the array is " + max);
		
		int min = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.println("The minimum value in the array is " + min);
		
	}

}
