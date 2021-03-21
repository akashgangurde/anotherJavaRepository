import java.sql.*;

public class FetchRecords1 {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
		
		connection.setAutoCommit(false);
		
		Statement statement = connection.createStatement();
		
		statement.addBatch("insert into emp2 values(23,'Lebron',45000000)");
		statement.addBatch("insert into emp2 values(3,'AD',42000000)");
		
		
		statement.executeBatch();
		
		connection.commit();
		connection.close();

	}

}
