import java.util.Stack;

public class StackSearchMethodExample {

	public static void main(String[] args) {
		
		Stack<String> stk= new Stack<>();

		stk.push("Mac Book");
		stk.push("HP");
		stk.push("DELL");
		stk.push("Asus");
		System.out.println("Stack: " + stk);

		int location = stk.search("HP");
		System.out.println("Location of Dell: " + location);
	}

}
