class OverloadingCalculations1 {
	
	void sum(int a, long b) {
		System.out.println(a + b);
	}
	

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
public class TypePromoion {

	public static void main(String[] args) {
		
		OverloadingCalculations1 obj=new OverloadingCalculations1();  
		
		  obj.sum(20,20);
		  
		  obj.sum(20,20,20);

	}

}
