interface Printable4 {
	void print();
	
}

interface Showable4 extends Printable4 {
	void show();
}

public class InterfaceInheritance implements Showable4 {
	
	@Override
	public void print() {
		System.out.println("print() invoked");
		
	}

	@Override
	public void show() {
		System.out.println("show() invoked");
		
	}

	public static void main(String[] args) {
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.print();
		obj.show();

	}

}
