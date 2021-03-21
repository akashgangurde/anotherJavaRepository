import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] array = {10, 50, 40, 10, 40, 10, 55, 50, 55, 84, 58};
		
		System.out.println("Original Array: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();

		Arrays.sort(array);
		int length = array.length;
		length = removeDuplicateElements(array, length);
		
		System.out.println("Removing Duplicate Array: ");
		for (int i = 0; i < length; i++) {
			System.out.print
			(array[i] + " ");
		}

	}
	
	public static int removeDuplicateElements(int[]a , int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int[] temp = new int[n];  
        int j = 0;
        
        for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}
        
        temp[j++] = a[n-1];
        
        for (int i = 0; i < j; i++) {
        	a[i] = temp[i];
		}
        
        return j;
	}

}
