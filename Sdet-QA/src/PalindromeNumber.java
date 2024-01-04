//A palindrome number is a number that remains the same when its digits are reversed. Like 16461 is a palindrome number.
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int orgNum = num; 
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}	
		
		if(orgNum == rev) {
			System.out.println("It is a palindrome number");
		}else {
			System.out.println("It is not a palindrome number");
		}
		sc.close();
		
	}

}
