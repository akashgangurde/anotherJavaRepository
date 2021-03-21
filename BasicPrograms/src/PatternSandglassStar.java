import java.util.Scanner;

public class PatternSandglassStar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = scanner.nextInt();
		
		
		for(int i = 0; i <= rows - 1; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= rows - 1 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		for(int i = rows - 1; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= rows - 1 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		


	}

}
