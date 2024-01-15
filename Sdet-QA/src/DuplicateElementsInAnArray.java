
public class DuplicateElementsInAnArray {

	public static void main(String[] args) {
		
		String a[] = {"JAVA", "C", "C++", "C#", "PYTHON", "JAVA"};
		
		//for duplicate elementts not found
		boolean flag = false; // initialize flag value as false
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {  // This will compare all other elements with i value which is first element
				if(a[i]==a[j]) {
					System.out.println("The duplicate element in this array is " + a[i]);
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("Duplicate elements not found");
		}
	}

}
