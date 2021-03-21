
public class RecursionFinite {
	
	int count = 0;
	void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	public static void main(String[] args) {
//		p();
		
		RecursionFinite recursionFinite = new RecursionFinite();
		recursionFinite.p();

	}

}
