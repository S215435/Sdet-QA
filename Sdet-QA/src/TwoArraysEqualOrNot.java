import java.util.Arrays;

public class TwoArraysEqualOrNot {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean x = Arrays.equals(a1, a2);
		
		if(x == true) {
			System.out.println("Arrays are equal"); 
		}else {
			System.out.println("Arrays are not equal");
		}
		
	}

}
