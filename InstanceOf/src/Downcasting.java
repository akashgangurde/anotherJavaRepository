class Animal2 {
	
}

public class Downcasting extends Animal2 {
	
	static void method(Animal2 a2) {
		if (a2 instanceof Downcasting) {
			Downcasting d = (Downcasting)a2;
			System.out.println("ok downcasting performed");
			
		}
	}

	public static void main(String[] args) {
		
		Animal2 a2= new Downcasting();
		
		Downcasting.method(a2);
	
		

	}

}
