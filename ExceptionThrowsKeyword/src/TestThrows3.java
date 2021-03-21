import java.io.IOException;

class M2 {
	void method() throws IOException {
		System.out.println("Device operation performed");
	}
}
public class TestThrows3 {

	public static void main(String[] args) throws IOException {
		
			M2 m2 = new M2();
			m2.method();
		
		System.out.println("Normal Flow...");

	}

}
