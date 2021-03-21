import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
			System.out.println("Enter regex pattern: ");
			Pattern pattern = Pattern.compile(scanner.nextLine());
			System.out.println("Enter text: ");
			Matcher matcher = pattern.matcher(scanner.nextLine());
			boolean found = false;
			while(matcher.find()) {
				System.out.println("I found the text " + matcher.group() + " starting at index " +     
		                 matcher.start() + " and ending at index " + matcher.end());
				found = true;
			}
			
			if (!found) {
				System.out.println("No matches found");
			}
		}
		

	

}
