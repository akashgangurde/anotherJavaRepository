class Parent3 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}
public class TestExceptionChild3 extends Parent3 {
	
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Parent3 parent3 = new TestExceptionChild3();
		try {
			parent3.msg();
		} catch (Exception e) {
		}

	}

}
