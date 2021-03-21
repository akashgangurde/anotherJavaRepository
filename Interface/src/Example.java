interface Printable {
	void print();
}

class A6 implements Printable {

	@Override
	public void print() {
		System.out.println("invoke printable");
		
	}
	
}
public class Example {

	public static void main(String[] args) {
		A6 obj = new A6();  
		obj.print();

	}

}
