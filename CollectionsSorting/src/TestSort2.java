import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort2 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Lebron");
		arrayList.add("AD");
		arrayList.add("Kuz");
		arrayList.add("KCP");
		
		Collections.sort(arrayList, Collections.reverseOrder());
		
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
