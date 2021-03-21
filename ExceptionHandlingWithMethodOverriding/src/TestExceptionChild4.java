import java.io.*;  

class Parent4 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}
public class TestExceptionChild4 extends Parent4 {
	
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Parent4 parent4 = new TestExceptionChild4();
		try {
			parent4.msg();
		} catch (Exception e) {
		}

	}

} 