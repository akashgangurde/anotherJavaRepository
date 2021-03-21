class Animal3 {
	void eat() {
		System.out.println("Animal eating...");
	}
}

class Dog3 extends Animal3 {
	void eat() {
		System.out.println("Dog eating...");
	}
}
public class MultiLevelInheritanceDemo2 extends Dog3  {

	public static void main(String[] args) {
		Animal3 animal3;
		
		animal3 = new MultiLevelInheritanceDemo2();
		animal3.eat();
	}

}
