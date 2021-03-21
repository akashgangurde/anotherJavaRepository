class Bike {
	final void run() {
		System.out.println("Bike is running");
	}
}
public class FinalMethodInheritance extends Bike {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		
		new FinalMethodInheritance().run();

	}

}
