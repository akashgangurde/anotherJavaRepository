import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateDemo {

	public static void main(String[] args) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
				
				CallableStatement callableStatement = connection.prepareCall("{call updater(?,?)}");
				
				callableStatement.setInt(1, 1);
				callableStatement.setString(2, "Luka Doncic");
				
				int i = callableStatement.executeUpdate();
				System.out.println(i + " rows affected");
			} catch (Exception e) {
				System.out.println(e);
			}
	}

}
