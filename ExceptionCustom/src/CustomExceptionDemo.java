
public class CustomExceptionDemo {
	
	static void validate(int age) throws InvalidAgeException {
		
		if (age < 18) {
			throw new InvalidAgeException("Not valid");
		} else {
			System.out.println("Welcome to vote");
		}
		
	}

	public static void main(String[] args) {
		try {
			validate(15);
		} catch (Exception e) {
			System.out.println("Exception occured " + e);
		}
		
		System.out.println("Rest of the code");

	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String s) {
		super(s);
	}
}
