
public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}	
		}
		System.out.println("Largest element of arr : " + max);
	}

}
