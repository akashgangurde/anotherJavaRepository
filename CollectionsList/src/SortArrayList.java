import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		
		Collections.sort(list1);
		
		for (String fruit:list1) {
			System.out.println(fruit);
		}
		
		System.out.println("Sorting Numbers");
		

		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(21);
		list2.add(5);
		list2.add(111);
		list2.add(2315);
		
		Collections.sort(list2);
		
		for (Integer number:list2) {
			System.out.println(number);
		}
	}

}
