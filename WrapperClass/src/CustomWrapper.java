class Javatpoint {
	
	private int i;
	
	Javatpoint() {
		
	}

	public Javatpoint(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
	
	
	
}
public class CustomWrapper {

	public static void main(String[] args) {
		
		Javatpoint j = new Javatpoint(10);  
		System.out.println(j);

	}

}
