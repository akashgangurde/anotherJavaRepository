import java.net.InetAddress;

public class InetDemo {

	public static void main(String[] args) {
		try {
			
			InetAddress ip = InetAddress.getByName("www.google.com");
			
			System.out.println("Hostname: " + ip.getHostName());
			System.out.println("Hostname: " + ip.getHostAddress());

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
