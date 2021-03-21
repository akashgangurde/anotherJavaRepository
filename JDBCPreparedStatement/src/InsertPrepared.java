import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?, ?)");
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "DS");
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records inserted");
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
