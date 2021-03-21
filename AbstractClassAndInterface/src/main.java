interface A {
	void a();
	void b();
	void c();
	void d();

}

abstract class B implements A {

	@Override
	public void c() {
		System.out.println("void c() invoked");
		
	}
	
}

class M extends B {

	@Override
	public void a() {
		System.out.println("void a() invoked");
		
	}

	@Override
	public void b() {
		System.out.println("void b() invoked");
		
	}

	@Override
	public void d() {
		System.out.println("void d() invoked");
		
	}
	
}
public class main {

	public static void main(String[] args) {
		
		A a = new M();
		
		a.a();
		a.b();
		a.c();
		a.d();
		

	}

}
