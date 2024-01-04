// A palindrome String is a String that remains the same when  it's characters are reversed. Like MADAM is a palindrome string.
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String orgStr = str;
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i-- ) {
			rev = rev + str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			System.out.println("It is a palindrome string");
		}else {
			System.out.println("It is not a palindrome number");
		}
		
		sc.close();
	}

}
