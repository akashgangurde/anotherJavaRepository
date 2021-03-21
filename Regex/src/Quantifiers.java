import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		
		
		System.out.println("? Quantiifier");
		System.out.println(Pattern.matches("[abc]?", "a"));
		System.out.println(Pattern.matches("[abc]?", "aaa"));
		System.out.println(Pattern.matches("[abc]?", "aabbbbccc"));
		System.out.println(Pattern.matches("[abc]?", "azztt"));
		System.out.println(Pattern.matches("[abc]?", "ab"));

		System.out.println("+ Quantifier");
		System.out.println(Pattern.matches("[abc]+", "a"));
		System.out.println(Pattern.matches("[abc]+", "aaa"));
		System.out.println(Pattern.matches("[abc]+", "aabbbcc"));
		System.out.println(Pattern.matches("[abc]+", "attz"));

		System.out.println("* Quantifier");
		System.out.println(Pattern.matches("[abc]*", "abbbbca"));

	}

}
