import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the desired number which you want factorial for:");
		int num = sc.nextInt();
		
		long factorial = 1;
		
		for(int i=1; i<=num; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The factorial of the number is " + factorial);
		
		sc.close();
		
	}

}
