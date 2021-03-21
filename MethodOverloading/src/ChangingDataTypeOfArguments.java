class Adder2 {
	static int add(int a, int b) {
		return a + b;
	}
	
	static double add(double a, double b) {
		return a + b;
	}

}
public class ChangingDataTypeOfArguments {

	public static void main(String[] args) {
		System.out.println(Adder.add(25, 50));
		System.out.println(Adder.add(12,  25));
	}

}
