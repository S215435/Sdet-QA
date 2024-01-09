// Fibonacci number - Sum of two preceding numbers
// 0 1 1 2 3 5 8 13 21 34 55

public class FibonacciNumber {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1+" "+n2);  // 0 1  // Same here as well, print instead of println
		
		for(int i=2; i<10; i++) {
			sum = n1+n2;   // 1
			System.out.println(" "+sum);  // If we write (print instead of println) we get the output in the same line
			n1 = n2;
			n2 = sum;
		}
	}

}
