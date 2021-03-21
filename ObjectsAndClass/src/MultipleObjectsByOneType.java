class RectangleClass {
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
public class MultipleObjectsByOneType {

	public static void main(String[] args) {
		RectangleClass r1 = new RectangleClass(), r2 = new RectangleClass();
		
		r1.insert(10, 20);
		r1.calculateArea();
		
		
		r2.insert(55, 25);
		r2.calculateArea();


	}

}
