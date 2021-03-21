class Parent1 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}
public class TestExceptionChild1 extends Parent1 {
	
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) throws Exception {
		Parent1 parent1 = new TestExceptionChild1();
		parent1.msg();

	}

} 