class Rectangle {
	int length;
	int width;
	
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	
	void calculateArea() {
		System.out.println("Area = " + length * width);
	}
}
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.insert(10, 20);
		r1.calculateArea();
		
		Rectangle r2 = new Rectangle();
		r2.insert(55, 25);
		r2.calculateArea();


	}

}
