
public class PrintEvenPosition {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		System.out.println("Printing even position of arr");
		
		for (int i = 1; i < arr.length;i = i+2) {
			System.out.println(arr[i] + " " );	
		}
	}

}
