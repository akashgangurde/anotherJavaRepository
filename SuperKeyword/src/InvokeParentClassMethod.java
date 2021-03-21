class Animal2 {
	void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog2 extends Animal2 {
	void eat() {
		System.out.println("Dog is eating...");
	}
	
	void bark() {
		System.out.println("Dog is barking...");
	}
	
	void work() {
		super.eat();
		bark();
	}
}
public class InvokeParentClassMethod {

	public static void main(String[] args) {
		Dog2 d=new Dog2();  
		d.work();

	}

}
