
public class RotationString {

	public static void main(String[] args) {
		
		String string1 = "lakers";
		String string2 = "srekal";
		
		if (checkRotation(string1, string2)) {
			System.out.println("Yes " + string2 + " is a rotation of " + string1);
		} else {
			System.out.println("No " + string2 + " is not a rotation of " + string1);

		}

	}
	
	
	public static boolean checkRotation(String string, String string2) {
		
		if (string.length() != string2.length()) {
			return false;
		}
		
		String string3 = string + string2;
		
		if (string3.contains(string2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
