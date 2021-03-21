import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner scanner6 = new Scanner(System.in);
		
		System.out.println("Enter a string to check if its Palindrome");
		System.out.println(isPalindrome(scanner6.nextLine()));
		
		scanner6.close();

	}
	
	public static boolean isPalindrome(String string) {
		
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.reverse();
		String reverse = stringBuilder.toString();
		
		if (string.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
