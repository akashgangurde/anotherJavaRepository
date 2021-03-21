import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Lebron");
		set.add("AD");
		set.add("Kuz");
		set.add("KCP");
		
		System.out.println("An initial list of elements: " + set);

		set.remove("Lebron");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Trez");
        set1.add("AC");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);

        set.removeIf(str->str.contains("AD"));
        System.out.println("After invoking removeIf() method: " + set);

        set.clear();
        System.out.println("After invoking clear() method: " + set);
        
	}

}
