import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Lebron");
		queue.add("AD");
		queue.add("Kuz");
		queue.add("Trez");
		queue.add("KCP");
		
		System.out.println("head: " + queue.element());
		System.out.println("head: " + queue.peek());
		
		Iterator<String> iterator = queue.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		queue.remove();
		queue.poll();
		
		System.out.println("after removing two elements: ");
		
		Iterator<String> iterator2 = queue.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	
	}

}
