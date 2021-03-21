class S2{
	void m(S2 obj) {
		System.out.println("mehthod is invoked");
	}
	
	void p() {
		m(this);
	}
}
public class ToPassArgInMethod {

	public static void main(String[] args) {
		S2 s1 = new S2();  
		  s1.p(); 
	}

}
