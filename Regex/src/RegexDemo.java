import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "lebron23"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "lebronjames23"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{3}", "AD3"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "AD$3"));



	}

}
