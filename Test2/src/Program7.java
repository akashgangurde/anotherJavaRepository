
public class Program7 {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3}, 
				     {3,4,5}};
		int[][] b = {{1,1,1}, 
				     {1,2,3}};
		
		
		int aRows = a.length;
		int aColumns = a[0].length;
		
		int bRows = b.length;
		int bColumns = b[0].length;
		
		int[][] c = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
