class OverloadingCalculations2 {
	
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}
	

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}
}

public class TypePromotionWithMatchingFound {

	public static void main(String[] args) {
		OverloadingCalculations2 obj=new OverloadingCalculations2(); 
		
		  obj.sum(20,20);

	}

}
