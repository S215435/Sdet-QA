// Linear Search
public class SearchingElementInAnArray {

	public static void main(String[] args) {
		int a[] = {1,3,6,8,9};
		int expValue = 8;
		
		boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == expValue) {
				System.out.println("Matched Element in the array is " + a[i]);
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("No any elements matched");
		}
	}

}
