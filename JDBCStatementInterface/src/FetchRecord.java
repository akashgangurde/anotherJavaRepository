import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecord {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
		Statement statement = connection.createStatement();
		
//		statement.execute("insert into  emp values(5, 'DS')");
//		int result = statement.executeUpdate("update emp set name='GA', where id=5");
		
		int result = statement.executeUpdate("delete from emp where id=4");
		System.out.println(result + " records affected");
		
		 connection.close();
	}

}
