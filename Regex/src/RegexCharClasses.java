import java.util.regex.Pattern;

public class RegexCharClasses {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]", "abcd"));
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "bbsaaa"));


	}

}
