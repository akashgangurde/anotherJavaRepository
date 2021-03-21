
public class PatternMirroredRightTriangleStar {

	public static void main(String[] args) {
		
		int row = 7;
		
		for(int i = 0; i <= row; i++) {
			for(int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
