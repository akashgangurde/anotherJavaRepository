import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.add("Lebron");
		stack.add("AD");
		stack.add("Kuz");
		stack.add("KCP");
		
		Iterator itr = stack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
