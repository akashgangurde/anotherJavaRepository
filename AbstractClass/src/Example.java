abstract class Bike {
	abstract void run();
}
public class Example extends Bike {
	void run() {
		System.out.println(" is running");
	}

	public static void main(String[] args) {
		Bike bike = new Example();

		bike.run();
	}

}
