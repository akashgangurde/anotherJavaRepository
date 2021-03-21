import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Lebron");
		set.add("AD");
		set.add("KCP");

		System.out.println("Traversing element through Iterator in descending order");
		Iterator<String> iterator = set.descendingIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
