import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("Lebron");
		set.add("AD");
		set.add("Lebron");
		set.add("KCP");

		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
