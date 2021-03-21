
public class TestExceptionPropagation1 {
	
	void m() {
		int data = 50 / 0;
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		TestExceptionPropagation1 exceptionPropagation1 = new TestExceptionPropagation1();
		exceptionPropagation1.p();
		System.out.println("Normal flow...");

	}

}
