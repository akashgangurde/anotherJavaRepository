
public class FinallyBlock3 {

	public static void main(String[] args) {
		try {
			int i = 25 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block is always Executed");
		}
		
		System.out.println("Rest of the code");

	}

}
