
public class ReverseAString {

	public static void main(String[] args) {
		String str = "abcd";
		String rev = ""; // If we use null instead of "", we get nulldcba as output
		
		int len = str.length();  // 4 in this
		
		for(int i = len-1; i>=0;i--) {
			rev = rev+ str.charAt(i); // To extract specific character from string s we use charAt(index)
		}
		System.out.println(rev);
		
	}

}
