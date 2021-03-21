import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> list = new java.util.ArrayList<String>();
		
		list.add("Lebron");
		list.add("AD");
		list.add("Kuz");
		list.add("KCP");
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
