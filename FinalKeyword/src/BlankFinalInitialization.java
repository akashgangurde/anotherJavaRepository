
public class BlankFinalInitialization {
	
	final int speedLimit;
	
	BlankFinalInitialization() {
		speedLimit = 50;
		System.out.println(speedLimit);
	}

	public static void main(String[] args) {
		
		new BlankFinalInitialization();


	}

}
