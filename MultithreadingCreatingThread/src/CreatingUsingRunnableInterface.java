
public class CreatingUsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		CreatingUsingRunnableInterface m1 = new CreatingUsingRunnableInterface();
		Thread t1 = new Thread(m1);
		t1.start();

	}

}
