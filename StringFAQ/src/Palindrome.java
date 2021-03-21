
public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("lol"));
		
		System.out.println(isPalindrome("loll"));
		

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
