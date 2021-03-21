import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsProperties {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		Set set = p.entrySet();
		
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println(entry.getKey( ) +" = " + entry.getValue());
			
		}
	}

}
