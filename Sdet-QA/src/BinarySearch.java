public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90,100}; // should be in sorted order
		
		boolean flag = false;
		int expValue = 95;
		int l = 0;
		int h = a.length-1;
		
		while(l<=h) {
			int mid = (h+l)/2;
			
			if(expValue == a[mid]) {
				System.out.println("Element Found");
				flag = true;
				break;
			} 
			if(expValue < a[mid]) {
				h = mid - 1;
			}
			if(expValue > a[mid]) {
				l = mid - 1;
			}	
		}	
		if(flag == false) {
			System.out.println("Element not found");
		}
		
	}

}
