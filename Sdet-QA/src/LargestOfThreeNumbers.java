import java.util.Scanner;
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		// Logical Operator
		if(a>b && a>c) {
			System.out.println("a is the largest which is " + a);
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest which is " + b);
		}
		else {
			System.out.println("c is the largest which is " + c);
		}
		sc.close();
	}

}
