import java.util.Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 25, 45, 74};
		
		System.out.println("Smallest of a: " + getSmallest(a));
		System.out.println("Smallest of b: " + getSmallest(b));

	}
	
	public static int getSmallest(int[] a){  
		Arrays.sort(a);
		
		return a[0];  
		
		}

}
