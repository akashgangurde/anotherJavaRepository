class Operation {
	int square(int n) {
		return n * n;
	}
	
}

class Circle {
	Operation op;
	double pi = 3.14;
	
	double area (int radius) {
		op = new Operation();
		
		int rsqure = op.square(radius);
		return pi * rsqure;
	}
}
public class AggregatorsEx {

	public static void main(String[] args) {
		Circle c = new Circle();
		double area = c.area(5);
		System.out.println(area);
	}

}
