import java.util.Arrays;

public class AscendingOrderUsingMethod {

	public static void main(String[] args) {
		int[] array = {25, 41, 58, 7, 62, 14, 100, 477};
		
		Arrays.sort(array);
		
		System.out.println("Arrays sorted usig ascending order: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
