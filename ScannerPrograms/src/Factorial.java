import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner3 = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner3.nextInt();
		scanner3.nextLine();
		
		System.out.println(factorial(number));
		
		scanner3.close();

	}
	
	public static long factorial(int n) {
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}

}
