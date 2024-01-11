
public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		int a[] = {3,5,7,12,13};
		int sum = 0;
		
		// Very important concept to use in array problems(array.length). This can change with the number of elements in the array
		for(int i =0; i<a.length; i++) {  // It can also be i<= a.length - 1; 
			sum = sum + a[i];
		}
		
//		//alternative way : Enhanced for loop
//		for(int xyz:a) {
//			sum = sum + xyz;
//		}
		
		System.out.println("The sum of the elements of the given array is " + sum);
		
 	}

}
