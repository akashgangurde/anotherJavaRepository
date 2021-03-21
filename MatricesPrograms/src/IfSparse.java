
public class IfSparse {

	public static void main(String[] args) {
		
		int[][] a = {{1,0,0},{0,4,0},{0,0,5}};
		
		int rows =a.length;
		int cols = a[0].length;
		
		int size = rows * cols;
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
		}
		
		if (count > (size/2)) {
			System.out.println("Is a Sparse Matrix");
		} else {
			System.out.println("Is Not a Sparse Matrix");

		}
	}

}
