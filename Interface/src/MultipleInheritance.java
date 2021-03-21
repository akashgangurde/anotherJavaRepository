interface Printable2 {
	void print();
	
}

interface Showable {
	void show();
}


public class MultipleInheritance implements Printable2, Showable {

	@Override
	public void show() {
		System.out.println("print() invoked");
		
	}

	@Override
	public void print() {
		System.out.println("show() invoked");
		
	}

	public static void main(String[] args) {
		MultipleInheritance object = new MultipleInheritance();
		object.print();
		object.show();

	}

}
