import java.util.LinkedHashMap;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		
		System.out.println("Keys: " + hashMap.keySet());
		
		System.out.println("Values: " + hashMap.values());

		System.out.println("Key Value pairs: " + hashMap.entrySet());

	}

}
