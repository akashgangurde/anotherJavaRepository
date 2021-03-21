import java.util.HashMap;

public class HashMap4 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		hashMap.put(103, "DS");

		System.out.println("Initial list of elements: " + hashMap);
		
		hashMap.remove(100);
		System.out.println("Updated list of elements: " + hashMap);
		
		hashMap.remove(101);
		System.out.println("Updated list of elements: " + hashMap);
		
		hashMap.remove(102, "Kuz");
		System.out.println("Updated list of elements: " + hashMap);
		
	}

}
