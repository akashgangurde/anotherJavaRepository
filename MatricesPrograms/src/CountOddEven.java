
public class CountOddEven {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {8, 6, 4}, {4, 5, 6}};
		
		int countOdd = 0;
		int countEven = 0;
		
		int rows = a.length;
		int cols = a[0].length;
		
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if ((a[i][j] % 2 == 0)) {
						countEven++;
					} else {
						countOdd++;
					}
				}
			}
			
			System.out.println("Frequency of even nos: "+ countEven);
			System.out.println("Frequency of odd nos: "+ countOdd);

		}


	}


