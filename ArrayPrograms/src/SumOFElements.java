
public class SumOFElements {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int sum = 0;
		
		for (int i = 1; i < arr.length;i++) {
			sum += arr[i];

		}
		System.out.println("Sum of arr : " + sum);
	}

}
