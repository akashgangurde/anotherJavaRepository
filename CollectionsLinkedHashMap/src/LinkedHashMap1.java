import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
	}

}
