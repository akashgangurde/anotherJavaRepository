import java.io.IOException;

class M3 {
	void method() throws IOException {
		throw new IOException("Device error");
	}
}
public class TestThrows4 {

	public static void main(String[] args) throws IOException {
			M3 m3 = new M3();
			m3.method();

		
		System.out.println("Normal Flow...");

	}

}
