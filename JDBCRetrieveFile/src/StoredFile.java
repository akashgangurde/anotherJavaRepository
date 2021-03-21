import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoredFile {
	
	

public static void main(String[] args) {
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storefile", "root", "");
		
		PreparedStatement ps = connection.prepareStatement("insert into filetable values(?,?)");
		
		ps.setInt(1, 102);
		File f=new File("E:\\a.txt");  
		FileReader fr=new FileReader(f);  

		ps.setCharacterStream(2,fr,(int)f.length());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		              
		connection.close();  
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
}
