
public class CopyElementsOfArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 8, 9};
		
		System.out.println("Original array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("Copying arr1 to arr2");
		
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.err.print(arr2[i] + " ");
			
		}
 
	}

}
