import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Lebron");
		map.put(101, "AD");
		map.put(102, "Kuz");

		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
