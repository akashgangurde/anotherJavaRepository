import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {

	public static void main(String[] args) {
		
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(100, "Lebron");
		map.put(102, "AD");
		map.put(101, "Kuz");
		map.put(103, "KCP");
				
		System.out.println("headMap: " + map.headMap(102));

		System.out.println("tailMap: " + map.tailMap(102));

		System.out.println("subMap: " + map.subMap(100, 102));
	}

}
