class MyThread extends Thread {
	public void run () {
		System.out.println("shutdown hook task complete");
	}
}
public class TestShutdown1 {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("Now main sleeping... press ctrl + c to exit");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
	}

}
