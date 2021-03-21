
public class PrintElementsInReverseOrder {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		System.out.println("Elements of given array");
		for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " " );
		}
		System.out.println();
		
		System.out.println("In Reverse Order: ");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " " );
}

	}

}
