import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImageDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storeimage", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from imgtable");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				Blob blob = resultSet.getBlob(2);
				byte[] barr = blob.getBytes(1, (int)blob.length());
				
				FileOutputStream fileOutputStream = new FileOutputStream("E:\\demoimage1.jpg");
				fileOutputStream.write(barr);
				
				fileOutputStream.close();
				
			}
			
			System.out.println("OK");
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
