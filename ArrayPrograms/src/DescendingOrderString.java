import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderString {

	public static void main(String[] args) {
		String[] array = {"Orange", "Mango", "Apple", "Kiwi", "Strawberry"};
		
		Arrays.sort(array, Collections.reverseOrder());
				
		System.out.println("Arrays sorted usig Descending order:  " + Arrays.toString(array));
		

	}

}
