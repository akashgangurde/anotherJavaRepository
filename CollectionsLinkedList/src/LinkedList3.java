import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Lebron");
		linkedList.add("AD");
		linkedList.add("Kuz");
		linkedList.add("KCP");
		linkedList.add("AC");
		linkedList.add("Morris");
		linkedList.add("Gasol");
		linkedList.add("AC");
		linkedList.add("Morris");
		linkedList.add("Trez");	
		System.out.println("Initial list of elements: " + linkedList);
		
		linkedList.remove("AD");
		System.out.println("After invoking remove(object) method: " + linkedList);
		
		linkedList.remove(0);
		System.out.println("After invoking remove(index) method: " + linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<String>();
		
		linkedList2.add("Lebron");
		linkedList2.add("Wes");
		linkedList.addAll(linkedList2);
		
		System.out.println("Updated list : " + linkedList);
		
		linkedList.removeAll(linkedList2);
		System.out.println("After invoking removeAll() method: " + linkedList);
		
		linkedList.removeFirst();
        System.out.println("After invoking removeFirst() method: " + linkedList);
        
        linkedList.removeLast();
        System.out.println("After invoking removeLast() method: " + linkedList);
        
        linkedList.removeFirstOccurrence("AC");
        System.out.println("After invoking removeFirstOccurrence() method: " + linkedList);
        
        linkedList.removeLastOccurrence("Morris");
        System.out.println("After invoking removeLastOccurrence() method: " + linkedList);

        linkedList.clear();
        System.out.println("After invoking clear() method: " + linkedList);

	}

}
