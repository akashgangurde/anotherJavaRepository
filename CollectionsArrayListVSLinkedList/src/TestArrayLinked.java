import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Lebron");
		arrayList.add("AD");
		arrayList.add("Kuz");
		arrayList.add("KCP");
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Trez");
		linkedList.add("DS");
		linkedList.add("AC");
		linkedList.add("Wes");
		
		System.out.println("arrayList: " + arrayList);
		System.out.println("linkedList: " + linkedList);

	}

}
