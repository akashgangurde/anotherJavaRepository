import java.util.LinkedHashMap;

public class LinkedHashMap3 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		
		System.out.println("Before invoking remove() method: " + hashMap);
		
		hashMap.remove(102);
		
		System.out.println("After invoking remove() method: " + hashMap);

		
	}

}
