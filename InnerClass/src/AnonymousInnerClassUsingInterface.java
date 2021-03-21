interface Eatable {
	void eat();
}
public class AnonymousInnerClassUsingInterface {

	public static void main(String[] args) {
		Eatable eatable = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("Nice fruits");
				
			}
		};
		
		eatable.eat();
			
	}

}
