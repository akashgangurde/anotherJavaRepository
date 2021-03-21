import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
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
