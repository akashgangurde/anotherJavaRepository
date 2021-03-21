import java.sql.Connection;
import java.sql.*;


public class Insert {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
		
		CallableStatement callableStatement = connection.prepareCall("{call insert(?,?)}");
		
		callableStatement.setInt(1, 1011);
		callableStatement.setString(2, "FV");
		
		callableStatement.execute();
		
		System.out.println("Successfull");
		
	}

}
