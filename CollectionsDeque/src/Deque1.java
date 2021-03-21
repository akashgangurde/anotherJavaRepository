import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Deque1 {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.offer("Lebron");
		deque.offer("AD");
		deque.add("Luka");
		deque.offerFirst("KCP");
		
		System.out.println("After offerFirst traversal: ");
		for(String string : deque) {
			System.out.println(string);
		}
		
		deque.pollLast();
		
		System.out.println("After pollLast traversal: ");
		for(String string : deque) {
			System.out.println(string);
		}
	}

}
