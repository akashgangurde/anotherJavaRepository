import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;

public class RSMD {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			
			System.out.println("Total columns: " + resultSetMetaData.getColumnCount());
			System.out.println("Column Name of 1st column: " + resultSetMetaData.getColumnName(1));
			System.out.println("Column Type Name of 1st column: " + resultSetMetaData.getColumnTypeName(1));
			
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
