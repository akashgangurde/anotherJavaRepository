
public class GetNameSetNameGetID extends Thread{
	
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		GetNameSetNameGetID t1 = new GetNameSetNameGetID();
		GetNameSetNameGetID t2 = new GetNameSetNameGetID();
		
		System.out.println("Name of t1: " + t1.getName());
		System.out.println("Name of t2: " + t2.getName());
		System.out.println("ID of t1: " + t1.getId());

		t1.start();
		t2.start();
		
		t1.setName("New Thread Name");
		
		System.out.println("After changing name of t1: " + t1.getName());

	}

}
