
public class EvenOddInAnArray {

	public static void main(String[] args) {
		int a[] = {3,5,6,8,9};
		
		System.out.println("Even Numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0){
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Numbers: ");
		for(int i=0;i<a.length;i++) {	
			if(a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
				
	}

}
