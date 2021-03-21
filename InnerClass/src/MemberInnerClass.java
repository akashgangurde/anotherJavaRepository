class TestMemberOuter {
	private int data = 50;
	
	class Inner {
		void msg() {
			System.out.println("data is: " + data);
		}
	}
}
public class MemberInnerClass {

	public static void main(String[] args) {
		TestMemberOuter memberOuter = new TestMemberOuter();
		TestMemberOuter.Inner inner = memberOuter.new Inner();
		
		inner.msg();

	}

}
