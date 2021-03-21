import java.util.ArrayList;

public class ArrayListExample8 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		System.out.println("Initial list of elements: " + list1);
		
		list1.add("Lebron");
		list1.add("AD");
		list1.add("Kuz");
		list1.add("KCP");
		
		System.out.println("After invoking add(E e) method: " + list1);
		
		list1.add(1, "Wes");
		
		System.out.println("After invoking add(int index, E element) method: " + list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Trez");
		list2.add("DS");
		
		list1.addAll(list2);
		
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + list1);
		 
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("AC");
		list3.add("Gasol");
		
		list1.addAll(list3);

		
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + list1);
		
	}

}
