class Vehicle {
	public void run() {
		System.err.println("vehicle() invoked");
	}
}

class Car extends Vehicle {

	@Override
	public void run() {
		System.out.println("car() invoked");
	}
}

public class Program6 {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		vehicle.run();
	}

}
