class Reentrant {
	
	public synchronized void m() {
		n();
		System.out.println("this is m() method");
	}
	
	public synchronized void n() {
		System.out.println("this is n() method");
	}
}

public class ReentrantExample {

	public static void main(String[] args) {
		
		final Reentrant reentrant = new Reentrant();
		
		Thread t1 = new Thread() {
			public void run() {
				reentrant.m();
			}
		};
		
		t1.start();

	}

}
