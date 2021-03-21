class JoinThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	
	
}
public class Program5 {

	public static void main(String[] args) {
		
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();

		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// t1 completed. 
		
		
		t2.start();
		t3.start();
		
	}

}
