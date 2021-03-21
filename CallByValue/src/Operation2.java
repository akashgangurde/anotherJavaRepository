
public class Operation2 {
	
	int data = 50;
	
	void change(Operation2 op2) {
		op2.data = op2.data + 100;
		
	}

	public static void main(String[] args) {
		Operation2 op2 = new Operation2();
		
		System.out.println("before change " + op2.data);  
		op2.change(op2);  
		System.out.println("after change " + op2.data);

	}

}
