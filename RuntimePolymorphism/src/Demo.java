class Bike{
	void run(){
		System.out.println("Bike invoked");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("splendor invoked");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Bike bike = new Splendor();
		bike.run();

	}

}
