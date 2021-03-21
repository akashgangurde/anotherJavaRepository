import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "Lebron");
		map.put(102, "AD");
		map.put(101, "Kuz");
		map.put(103, "KCP");
		
		System.out.println("Before invoking remove() method");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(102);
		
		System.out.println("After invoking remove() method");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
