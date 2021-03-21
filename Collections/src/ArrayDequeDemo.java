import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Lebron");
		deque.add("AD");
		deque.add("Kuz");

		for (String str : deque) {
		System.out.println(str);
		}
		
	}

}
