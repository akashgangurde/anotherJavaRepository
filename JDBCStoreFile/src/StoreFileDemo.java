import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class StoreFileDemo {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storefile", "root", "");
			
			PreparedStatement ps = connection.prepareStatement("insert into filetable values(?,?)");
			ps.setInt(1, 102);

			File file = new File("E:\\a.txt");
			FileReader fileReader = new FileReader(file);
			
			ps.setCharacterStream(2, fileReader,(int)file.length());
			
			int i = ps.executeUpdate();
			System.out.println(i + " records affexted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
