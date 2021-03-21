
public class FinnalyDemo {

	public static void main(String[] args) {
		try {
			int x = 400;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is executed");
		}

	}

}
