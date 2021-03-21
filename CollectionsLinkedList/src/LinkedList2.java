import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("Initial list of elements: " + linkedList);
		
		linkedList.add("Lebron");
		linkedList.add("AD");
		linkedList.add("Kuz");
		System.out.println("After invoking add(E e) method: " + linkedList);
		
		linkedList.add(1, "KCP");
		System.out.println("After invoking add(int index, E element) method: " + linkedList);
		 
		LinkedList<String> linkedList2 = new LinkedList<String>();
		 
		linkedList2.add("Gasol");
		linkedList2.add("AC");
		linkedList2.addAll(linkedList);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + linkedList);
		 
		LinkedList<String> linkedList3 = new LinkedList<String>();

		linkedList2.add("Trez");
		linkedList2.add("Morris");
		linkedList2.addAll(1, linkedList);
		 
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + linkedList);
		 
		linkedList.addFirst("DS");
		System.out.println("After invoking addFirst(E e) method: " + linkedList);
		 
		linkedList.addLast("Wes");
		System.out.println("After invoking addLast(E e) method: " + linkedList);
	}

}
