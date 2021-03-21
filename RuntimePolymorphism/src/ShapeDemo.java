class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Rectangle();
		shape.draw();
		
		shape = new Triangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();

	}

}
