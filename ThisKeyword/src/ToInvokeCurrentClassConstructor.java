class A2 {
	A2() {
		System.out.println("hello a");
	}
	A2(int x){
		this();
		System.out.println(x);
	}
}
public class ToInvokeCurrentClassConstructor {

	public static void main(String[] args) {
		A2 a=new A2(10);

	}

}
