class Animal {
	String color = "white";
}

class Dog extends Animal {
	String color = "black";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}


public class ReferToFieldsOFParentClass {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.printColor();

	}

}
