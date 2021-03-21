
class StaticNestedClass2 {
	
static int data = 45;
	
	static class Inner {
		static void msg() {
			System.out.println("Data is: " + data);
		}
	}

	public static void main(String[] args) {
		StaticNestedClass2.Inner.msg();

	}

}
