
public class Factorial {

	public static void main(String[] args) {
		getFactorial(5);

	}
	
	public static void getFactorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;	
		}
		System.out.println("Factorial of " + n +" is " + fact);
	}

}
