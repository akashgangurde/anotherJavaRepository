import java.util.Scanner;

/**
 * @author AG
 *
 */
public class Calculations {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 Numbers ");
		int number1 = scanner.nextInt();
		scanner.nextLine();
		int number2 = scanner.nextInt();
		scanner.nextLine();
		
		boolean quit = false;
		
		printMenu();
		
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0 :
				System.out.println("Calculations Complete, Quitting Calculator");
				quit = true;
				break;
			case 1:
				int sum = number1 + number2;
				System.out.println("Addition = " + sum);
				break;
			case 2:
				int subtraction = number1 - number2;
				System.out.println("Subtraction = " + subtraction);
				break;
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
		
		scanner.close();
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\nPress");
		System.out.println("0 - To Quit\n" + 
				"1 - To Add\n" + 
				"2 - To Subtract\n" + 
				"3 - To Multiply\n" + 
				"4 - To Divide");
	}

}
