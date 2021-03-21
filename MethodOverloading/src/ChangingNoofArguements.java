class Adder {
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static int add(int a, int b) {
		return a + b;
	}

}
public class ChangingNoofArguements {

	public static void main(String[] args) {
		System.out.println(Adder.add(25, 50));
		System.out.println(Adder.add(12,  25,  50));
	}

}
