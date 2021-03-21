import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Lebron");
		list.add("AD");
		list.add("Kuz");
		list.add("KCP");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
