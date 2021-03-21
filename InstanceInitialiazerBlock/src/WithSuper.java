class A {
	A () {
		System.out.println("Parent class is invoked");
	}
}

class B extends A {
	B() {
		super();

		System.out.println("child class constructoris invoked");
	}
	
	{
		System.out.println("instance initialiazer block is invoked");
	}
	
}
public class WithSuper {

	public static void main(String[] args) {
		B b = new B();

	}

}
