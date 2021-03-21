import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Lebron");
		linkedList.add("AD");
		linkedList.add("Kuz");
		linkedList.add("KCP");

		Iterator<String> iterator = linkedList.descendingIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
