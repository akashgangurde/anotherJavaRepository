class Animal3 {
	Animal3() {
		System.out.println("animal is created");
	}
}

class Dog3 extends Animal3{
	Dog3() {
		super();
		System.out.println("Dog is created");
		
	}
}
public class InvokeParentClassConstructor {

	public static void main(String[] args) {
		Dog3 d = new Dog3();
		

	}

}
