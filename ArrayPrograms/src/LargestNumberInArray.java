import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] b = {10, 25, 45, 74};
		
		System.out.println("Largest of a: " + getLargest(a));
		System.out.println("Largest of b: " + getLargest(b));

	}
	
	
	public static int getLargest(int[] a){  
		Arrays.sort(a);
		
		return a[a.length - 1];  
		
		}

}
