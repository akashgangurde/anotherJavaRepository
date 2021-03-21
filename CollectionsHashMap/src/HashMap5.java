import java.util.HashMap;
import java.util.Map;

public class HashMap5 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(100, "Lebron");
		hashMap.put(101, "AD");
		hashMap.put(102, "Kuz");
		hashMap.put(103, "DS");

		System.out.println("Initial list of elements: ");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		System.out.println("Updated list of elements: ");
		
		hashMap.replace(102, "Gasol");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		System.out.println("Updated list of elements: ");
		
		hashMap.replace(101, "AD", "Trez");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		System.out.println("Updated list of elements: ");
		
		hashMap.replaceAll((k,v) -> "Wes");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		
		
	}

}
