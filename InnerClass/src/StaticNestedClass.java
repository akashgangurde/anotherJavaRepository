
class StaticNestedClass {
	
static int data = 45;
	
	static class Inner {
		void msg() {
			System.out.println("Data is: " + data);
		}
	}

	public static void main(String[] args) {
		StaticNestedClass.Inner inner = new StaticNestedClass.Inner();
		inner.msg();

	}

}
