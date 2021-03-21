import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactionmanagement", "root", "");
		
		connection.setAutoCommit(false);
		
		
		Statement statement = connection.createStatement();
		statement.executeUpdate("insert into emp values(23,'Lebron',4500000)");
		statement.executeUpdate("insert into emp values(3,'AD',4200000)");
		
		connection.commit();
		
		connection.close();

	}

}
