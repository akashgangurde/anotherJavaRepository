import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderUsingMethod {

	public static void main(String[] args) {
		Integer[] array = {25, 41, 58, 7, 62, 14, 100, 477};
		
		Arrays.sort(array, Collections.reverseOrder());
				
		System.out.println("Arrays sorted usig Descending order:  " + Arrays.toString(array));
		

	}

}
