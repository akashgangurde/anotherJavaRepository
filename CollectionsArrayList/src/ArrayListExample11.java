import java.util.ArrayList;

public class ArrayListExample11 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		al.add("Lebron");
		al.add("AD");
		al.add("Kuz");
		System.out.println("After insertion");
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
	}

}
