import java.io.IOException;

public class TestThrows1 {
	
	void m() throws IOException {
		throw new IOException("Device error");
	}
	
	void n() throws IOException {
		m();
	}
	
	void p() throws IOException {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
	} 

	public static void main(String[] args) throws IOException {
		TestThrows1 testThrows1 = new TestThrows1();
		testThrows1.p();
		System.out.println("Normal flow...");

	}

}
