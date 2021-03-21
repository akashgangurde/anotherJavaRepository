interface Printable {
	
}

class A implements Printable {
	public void a() {
		System.out.println("a mothod is invoked");
	}
}

class B implements Printable {
	public void b() {
		System.out.println("b method is invoked");
	}
}

class Call {
	void invoke(Printable p) {
		if (p instanceof A) {
			A a = (A)p;
			a.a();
			
		}
		
		if (p instanceof B) {
			B b = (B)p;
			b.b();
		}
	}
}

public class RealUse {

	public static void main(String[] args) {
		
		Printable p = new B();
		Call c= new Call();
		
		c.invoke(p);

	}

}
