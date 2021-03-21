
public class LocalInnnerClassWithLocalVariable {
	
	private int data = 30;
	
	void display() {
		int value = 50;
		
		class Local {
			void msg() {
				System.out.println(value);
			}
		}
		Local local = new Local();
		local.msg();
	}

	public static void main(String[] args) {
		LocalInnnerClassWithLocalVariable obj = new LocalInnnerClassWithLocalVariable();
		obj.display();

	}

}
