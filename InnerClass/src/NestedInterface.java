interface IShowable {
	void show();
	
	interface IMessage {
		void msg();
	}
}
public class NestedInterface implements IShowable.IMessage {

	@Override
	public void msg() {
		System.out.println("Hello nested interface");
		
	}

	public static void main(String[] args) {
		IShowable.IMessage message = new NestedInterface();
		message.msg();

	}

}
