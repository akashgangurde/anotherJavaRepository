import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet4 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Lebron");
		arrayList.add("AD");
		arrayList.add("Kuz");

		HashSet<String> hashSet = new HashSet<String>(arrayList);
		hashSet.add("Trez");
		
		Iterator<String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
	}

}
