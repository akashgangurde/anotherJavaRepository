import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		Iterator itr = list.iterator();
		
		for (String fruit:list) {
			System.out.println(fruit);
		}
	}

}
