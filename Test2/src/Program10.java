
public class Program10 {

	public static void main(String[] args) {
		
		try {
			String string = null;
			System.out.println(string.charAt(1));
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("rest of the program");
	}

}
