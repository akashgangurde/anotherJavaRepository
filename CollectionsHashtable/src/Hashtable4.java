import java.util.Hashtable;

public class Hashtable4 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(100, "Lebron");
		hashtable.put(102, "AD");
		hashtable.put(101, "Kuz");
		hashtable.put(103, "KCP");
		
		System.out.println("Initial map: " + hashtable);
		
		hashtable.putIfAbsent(104, "Trez");
		System.out.println("Updated map: " + hashtable);
		
		hashtable.putIfAbsent(101, "Kuz");
		System.out.println("Updated map: " + hashtable);

	}

}
