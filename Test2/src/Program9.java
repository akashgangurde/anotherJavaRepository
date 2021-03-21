import java.util.Iterator;
import java.util.TreeSet;

public class Program9 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(6);
		treeSet.add(7);
		treeSet.add(8);
		treeSet.add(9);
		treeSet.add(10);
		
		System.out.println("Sorting using TreeSet: ");
		Iterator<Integer> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Sorting using TreeSet, descendingIterator(): ");
		Iterator<Integer> descendingIterator = treeSet.descendingIterator();
		
		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
			
		}

	}

}
