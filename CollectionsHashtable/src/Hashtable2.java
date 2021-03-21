import java.util.Hashtable;
import java.util.Map;

public class Hashtable2 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(100, "Lebron");
		hashtable.put(102, "AD");
		hashtable.put(101, "Kuz");
		hashtable.put(103, "KCP");
		
		System.out.println("Before remove() "+ hashtable);
		
		hashtable.remove(102);
		
		System.out.println("After remove() "+ hashtable);

	}

}
