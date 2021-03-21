abstract class Bike2 {
	Bike2() {
		System.out.println("Bike is created");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda2 extends Bike2 {
	void run() {
		System.out.println("Running safely");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Bike2 obj = new Honda2();
		obj.run();
		obj.changeGear();
	}

}
