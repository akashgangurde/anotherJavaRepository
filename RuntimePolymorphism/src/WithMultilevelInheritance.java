class Animal2 {
	void eat() {
		System.out.println("Animal eating...");
	}
}

class Dog2 extends Animal2 {
	void eat() {
		System.out.println("Dog eating...");
	}
}

class BabyDog extends Animal2 {
	void eat() {
		System.out.println("BabyDob eating...");
	}
}

public class WithMultilevelInheritance {

	public static void main(String[] args) {
		Animal2 a1, a2, a3;
		
		a1 = new Animal2();
		a2 = new Dog2();
		a3 = new BabyDog();
		
		a1.eat();
		a2.eat();
		a3.eat();

	}

}
