import java.util.Scanner;

public class SwitchOperations {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a choice: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		getSwitchOperations(a);
		

	}
	
	public static void getSwitchOperations(int ch) {
		System.out.println("enter 2 numbers ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();

		
		switch(ch) {
		case 1:
			int sum = number1 + number2;
			System.out.println("Addition = " + sum);
			break;
		case 2:
			int subtraction = number1 - number2;
			System.out.println("Subtraction = " + subtraction);
		case 3:
			int multipilication = number1 * number2;
			System.out.println("Multipilication = " + multipilication);
			break;
		case 4:
			int division = number1 / number2;
			System.out.println("Division = " + division);
			break;
		case 5:
			int remainder = number1 % number2;
			System.out.println("Remainder = " + remainder);
			break;
			default:
				System.out.println("Invalid Option");
		} 
	}

}
