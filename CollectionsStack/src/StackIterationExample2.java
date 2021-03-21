import java.util.Stack;

public class StackIterationExample2 {

	public static void main(String[] args) {
		
		Stack <Integer> stk = new Stack<>();
		
		stk.push(119);
		stk.push(203);
		stk.push(988);
		System.out.println("Iteration over the stack using forEach() Method:");

		stk.forEach(n ->
		{
		System.out.println(n);
		});
	}

}
