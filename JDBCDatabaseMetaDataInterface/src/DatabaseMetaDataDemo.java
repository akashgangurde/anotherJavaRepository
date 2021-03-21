
import java.sql.*;


public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			DatabaseMetaData databaseMetaData =  connection.getMetaData();
			
			System.out.println("Driver Name: " + databaseMetaData.getDriverName());
			System.out.println("Driver Version: " + databaseMetaData.getDriverVersion());
			System.out.println("Username: " + databaseMetaData.getUserName());
			System.out.println("Database Product Name: " + databaseMetaData.getDatabaseProductName());
			System.out.println("Database Product Version: " + databaseMetaData.getDatabaseProductVersion());
			
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
