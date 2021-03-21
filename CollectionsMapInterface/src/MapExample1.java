import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		
		map.put(1, "Lebron");
		map.put(5, "AD");
		map.put(2, "Kuz");
		map.put(6, "KCP");
		
		Set set = map.entrySet();
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
