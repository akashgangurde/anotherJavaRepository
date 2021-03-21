import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
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
