interface Drawable {
	
	void draw();
}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("drawing rectanble");
		
	}	
}

class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("drawing circle");
		
	}	
}
public class Example2 {

	public static void main(String[] args) {
		Drawable drawable = new Circle();
		drawable.draw();

	}

}
