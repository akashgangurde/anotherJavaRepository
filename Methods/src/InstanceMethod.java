
public class InstanceMethod {

	public static void main(String[] args) {
		InstanceMethod obj = new InstanceMethod();
		System.out.println("The Sum is " + obj.add(15, 25));
	}
	
	int s;
	
	public int add(int a, int b) {
		s = a + b;
		return s;
	}

}
