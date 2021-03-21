import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {	
		
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean result = stack.empty();
		
		System.out.println("Is stack empty? " + result);
		
		stack.push(78);
		stack.push(5);
		stack.push(95);
		stack.push(12);
		
		System.out.println("Elements in stack: " + stack);
		
		result = stack.isEmpty();
		
		System.out.println("Is stack empty? " + result);

	}

}
