class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating");
	}
}

class Lion extends Animal {
	void eat() {
		System.out.println("Lion is eating");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();
		
		animal = new Lion();
		animal.eat();

	}

}
