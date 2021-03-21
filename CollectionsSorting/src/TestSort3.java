import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort3 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(Integer.valueOf(23));
		arrayList.add(Integer.valueOf(0));
		arrayList.add(5);
		
		Collections.sort(arrayList);
		
		Iterator iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
