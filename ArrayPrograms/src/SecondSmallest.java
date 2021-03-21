
public class SecondSmallest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 25, 45, 74};
		
		System.out.println("Second Smallest of a: " + getSecondSmallest(a));
		System.out.println("Second Smallest of b: " + getSecondSmallest(b));

	}
	
	public static int getSecondSmallest(int[] a) {
		
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
		
		return a[1];
	}


}
