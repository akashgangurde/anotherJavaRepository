import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Lebron");
		vector.addElement("AD");
		vector.addElement("Kuz");

		Enumeration e = vector.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
