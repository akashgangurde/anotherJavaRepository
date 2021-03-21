import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("Lebron");
		v.add("AD");
		v.add("Kuz");
		v.add("KCP");
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
