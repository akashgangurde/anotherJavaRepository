import java.util.Hashtable;

public class Hashtable3 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		hashtable.put(100, "Lebron");
		hashtable.put(102, "AD");
		hashtable.put(101, "Kuz");
		hashtable.put(103, "KCP");
		
		System.out.println(hashtable.getOrDefault(101, "Not Found"));
		
		System.out.println(hashtable.getOrDefault(105, "Not Found"));

	}

}
