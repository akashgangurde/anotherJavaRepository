import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DeleteDemo {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			CallableStatement callableStatement = connection.prepareCall("{call deleter(?)}");
			
			callableStatement.setInt(1, 5);
			
			int i = callableStatement.executeUpdate();
			System.out.println(i + " rows affected");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
