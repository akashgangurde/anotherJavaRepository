import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveFileDemo {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storefile", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from filetable");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			Clob clob = resultSet.getClob(2);
			Reader reader = clob.getCharacterStream();
			
			FileWriter fileWriter = new FileWriter("E:\\a.txt");
			
			int i;
			
			while((i = reader.read()) != -1) 
				fileWriter.write((char)i);
				
				fileWriter.close();
				
				connection.close();
				
				System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
