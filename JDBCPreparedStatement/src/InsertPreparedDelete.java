import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPreparedDelete {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("delete from emp where id = ?");
			
			preparedStatement.setInt(1, 3);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records deleted");
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
