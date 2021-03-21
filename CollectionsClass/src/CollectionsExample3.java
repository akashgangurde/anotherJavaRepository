import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample3 {
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(23);
		list.add(3);
		list.add(0);
		list.add(16);
		list.add(34);
		list.add(255);
		list.add(14);

		System.out.println("Value of minimumaximum element from collection: " + Collections.min(list));
	}
}
