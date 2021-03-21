import java.util.regex.Pattern;

public class Metacharacters {

	public static void main(String[] args) {
		
		
		System.out.println("Metacharacters \\d... Means Any Digits");
		
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "5"));
		System.out.println(Pattern.matches("\\d", "545"));
		System.out.println(Pattern.matches("\\d", "545abc"));

		System.out.println("Metacharacters \\D... Means Non Digits");

		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "5"));
		System.out.println(Pattern.matches("\\D", "545"));
		System.out.println(Pattern.matches("\\D", "545abc"));
		System.out.println(Pattern.matches("\\D", "L"));
		
		
		System.out.println("Metacharacters \\D*... Means Non Digits With Quantifier");

		System.out.println(Pattern.matches("\\D*", "Lakers"));


	}

}
