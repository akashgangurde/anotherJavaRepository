import java.util.HashMap;
import java.util.Map;

public class MapExample3 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Lebron");
		map.put(101, "AD");
		map.put(102, "Kuz");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out :: println);
	}

}
