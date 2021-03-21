import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		
		System.out.println("After invoking put() method ");
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hashMap.putIfAbsent(103, "Trez");
		System.out.println("After invoking putIfAbsent() method ");
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(104, "Wes");
		hashMap2.putAll(hashMap);
		System.out.println("After invoking putAll() method ");
		for(Map.Entry m : hashMap2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
