
public class Example {

	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.run();

	}

}
class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.err.println("Bike is running smoothly");
	}
}