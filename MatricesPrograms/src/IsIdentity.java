
public class IsIdentity {

	public static void main(String[] args) {
		
int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
		
		int rows =a.length;
		int cols = a[0].length;
		
		boolean flag = true;
		
		if (rows != cols) {
			System.out.println("Matrix should be square");
		}
		
		else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
				}
			}
			
			if (flag) {
				System.out.println("Given Matrix is an identity matrix");
			} else {
				System.out.println("Given Matrix is not an identity matrix");

			}
		}

	}

}
