import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseMetaDataDemo3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
			
			DatabaseMetaData databaseMetaData =  connection.getMetaData();
			
			String[] table = {"VIEW"};
			ResultSet resultSet = databaseMetaData.getTables(null, null, null, table);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(3));
				
				connection.close();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
