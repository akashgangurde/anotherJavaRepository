import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;


public class FuncSum {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcdemo", "root", "");
		
		CallableStatement callableStatement = connection.prepareCall("{?= call sum4(?,?)}");
		
		callableStatement.setInt(2, 55);
		callableStatement.setInt(3, 45);
		
		callableStatement.registerOutParameter(1, Types.INTEGER);
		
		callableStatement.execute();
		
		System.out.println(callableStatement.getInt(1));
		
	}

}
