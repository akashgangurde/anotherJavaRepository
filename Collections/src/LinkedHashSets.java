import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Lebron");
		set.add("AD");
		set.add("Lebron");
		set.add("Kuz");

		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
