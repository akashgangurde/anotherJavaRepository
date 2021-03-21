class A1 {
	A1 () {
		System.out.println("Parent class is invoked");
	}
}

class B2 extends A1 {
	B2() {
		super();

		System.out.println("child class constructoris invoked");
	}
	
	B2(int a) {
		super();
		
		System.out.println("child class constructoris invoked");
	}
	{
		System.out.println("instance initialiazer block is invoked");
	}
	
}
public class AnotherEx {

	public static void main(String[] args) {
		B2 b = new B2();
		B2 b1 = new B2();

	}

}
