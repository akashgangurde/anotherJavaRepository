import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample4 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println("Returning element: " + list.get(1) ) ;
			
		list.set(1, "Dates");
		
		Iterator itr = list.iterator();
		
		for (String fruit:list) {
			System.out.println(fruit);
		}
	}

}
