
public class SecondLargest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 25, 45, 74};
		
		System.out.println("Second Largest of a: " + getSecondLargest(a));
		System.out.println("Second Largest of b: " + getSecondLargest(b));

	}
	
	public static int getSecondLargest(int[] a) {
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[a.length - 2];
	}


}
