import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Lebron");
		linkedList.add("AD");
		linkedList.add("Kuz");
		linkedList.add("KCP");

		Iterator itr = linkedList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
