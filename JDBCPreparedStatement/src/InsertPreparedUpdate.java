import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPreparedUpdate {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("update emp set name=? where id=?");
			
			preparedStatement.setString(1, "Gasol");
			preparedStatement.setInt(2, 2);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records updated");
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
