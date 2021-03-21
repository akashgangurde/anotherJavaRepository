import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexExample1 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("as");
		
		//1st way
		
		boolean b = matcher.matches();
		
		//2nd way
		
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		
		boolean b3 = Pattern.matches(".s", "as");
		
		System.out.println(b + " " + b2 + " " + " " + b3);
	}

}
