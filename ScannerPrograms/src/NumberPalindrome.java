import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		Scanner scanner5 = new Scanner(System.in);
		
		System.out.println("Enter number to check NumberPalindrom");
		int n = scanner5.nextInt();
		scanner5.nextLine();
		
		System.out.println(isPalindrome(n));
		
		scanner5.close();
		
	}
	
	public static boolean isPalindrome(int number) {
		if (number < 0) {
			number *= 0;
		}
		
		int reverse= 0;
		int storedNumber = number;
		
		while(storedNumber > 0) {
			int lastDigit = storedNumber % 10;
			reverse *= 10;
			reverse += lastDigit;
			storedNumber /= 10;
		}
		
		if (number == reverse) {
			return true;
		} else return false;
	}

}
