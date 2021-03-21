import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		

		HashSet<String> set = new HashSet<String>();
		
		set.add("Lebron");
		set.add("AD");
		set.add("Kuz");
		set.add("KCP");

		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
