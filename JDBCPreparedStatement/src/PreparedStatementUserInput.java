import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementUserInput {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "");
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?, ?)");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("ender id: ");
			int id = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println("enter name: ");
			String name = bufferedReader.readLine();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records updated");
			
			System.out.println("do you want to continue? y/n");
			String s = bufferedReader.readLine();
			if (s.startsWith("n")) {
				break;
			}
		} while(true);
		
		connection.close();
		
	}

}
