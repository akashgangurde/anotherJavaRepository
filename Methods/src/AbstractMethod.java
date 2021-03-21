abstract class Demo {
	abstract void display();
}

class MyClass extends Demo {
	void display() {
		System.out.println("Abstract Method");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		Demo obj = new MyClass();  
		obj.display();
	}

}
