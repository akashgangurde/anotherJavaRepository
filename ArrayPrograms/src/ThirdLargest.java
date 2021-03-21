
public class ThirdLargest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 25, 45, 74};
		
		System.out.println("Third Largestof a: " + getThirdLargest(a, 7));
		System.out.println("Third Largestof b: " + getThirdLargest(b, 4));

	}
	
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total -3];
	}

}
