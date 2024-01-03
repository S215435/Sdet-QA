
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		
		System.out.println("Before swapping values are: " + a + " " + b);
		
		//Logic - using a third variable
		int x = a;
		a = b;
		b = x;
		
		System.out.println("After swapping values are: " + a + " " + b);
		
	}

}
