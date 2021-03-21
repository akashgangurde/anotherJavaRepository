import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CollectionsProperties2 {

	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties();
		properties.setProperty("name", "Lebron");
		properties.setProperty("email", "Lebron@gmailgmail.com");

		properties.store(new FileWriter("info.properties"), "Java Properties Example");
	}

}
