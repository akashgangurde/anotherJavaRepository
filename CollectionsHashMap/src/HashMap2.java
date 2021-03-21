import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "Mango");
		hashMap.put(2, "Apple");
		hashMap.put(3, "Banana");
		hashMap.put(1, "Grapes");
		
		
		System.out.println("Iterating Hashmap: ");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
