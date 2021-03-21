import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(100, "Lebron");
		hashtable.put(102, "AD");
		hashtable.put(101, "Kuz");
		hashtable.put(103, "KCP");
		
		for(Map.Entry m : hashtable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
