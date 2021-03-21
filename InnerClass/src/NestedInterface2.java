class A {
	
	interface IMessage {
		void msg();
	}
}
public class NestedInterface2 implements A.IMessage {

	@Override
	public void msg() {
		System.out.println("Hello nested interface");
		
	}

	public static void main(String[] args) {
		A.IMessage message = new NestedInterface2();
		message.msg();

	}

}
