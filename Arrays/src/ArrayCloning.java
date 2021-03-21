
public class ArrayCloning {

	public static void main(String[] args) {
		int arr[] = {22, 47, 5, 9, 8};
		
		System.out.println("Printing original array");
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Printing clone of the array");
		int[] cArr = arr.clone();
		
		for(int i : cArr) {
			System.out.println(i);
		}
		
		System.out.println("Are both equal?");  
		System.out.println(arr==cArr);
	}

}
