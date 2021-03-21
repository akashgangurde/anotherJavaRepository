import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(24);
		set.add(66);
		set.add(121);
		set.add(54);
		
		System.out.println("Highest Value: " + set.pollFirst());
		System.out.println("Lowest Value: " + set.pollLast());
	}

}
