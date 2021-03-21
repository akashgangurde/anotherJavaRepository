import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque1 {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Lebron");
		deque.add("AD");
		deque.add("Kuz");
		
		for(String string : deque) {
			System.out.println(string);
		}
	}

}
