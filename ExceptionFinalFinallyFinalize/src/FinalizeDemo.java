
public class FinalizeDemo {
	
	public void finalize() {
		System.out.println("Finalize called");
	}
	public static void main(String[] args) {
		FinalizeDemo finalizeDemo1 = new FinalizeDemo();
		FinalizeDemo finalizeDemo2 = new FinalizeDemo();
		
		finalizeDemo1 = null;
		finalizeDemo2 = null;
		
		System.gc();

	}

}
