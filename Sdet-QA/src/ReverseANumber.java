import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		//using algorithm
		
		int rev = 0;
		
		while(num != 0) {
			rev = rev * 10 + num%10; // 0 + 1234%10 = 4 , 40 + 123%10 = 43, 430 + 2 = 432, 4320 + 1 = 4321 
			num = num/10; // 1234/10 = 123, 123/10 = 12, 12/10 = 1, 1/10 = 0
		}
		
		System.out.println("Revrese of the number is: " + rev);
		
		sc.close();
	}
	
}
