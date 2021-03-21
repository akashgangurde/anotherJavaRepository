import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class TM {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactionmanagement", "root", "");
			
			connection.setAutoCommit(false);
			
			PreparedStatement ps = connection.prepareStatement("insert into emp values(?,?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				
				System.out.println("enter id");  
				String s1=br.readLine();  
				int id=Integer.parseInt(s1);  
				  
				System.out.println("enter name");  
				String name=br.readLine();  
				  
				System.out.println("enter salary");  
				String s3=br.readLine();  
				int salary=Integer.parseInt(s3);
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, salary);
				ps.executeUpdate();
				
				System.out.println("commit/rollback");  
				String answer=br.readLine();
				
				if (answer.equals("commit")) {
					connection.commit();
				}
				if (answer.equals("rollback")) {
					connection.rollback();;
				}
				
				System.out.println("Want to add more records y/n");  
				String ans=br.readLine();  
				
				if(ans.equals("n")) {  
					break;  
				}
			}
			
			connection.commit();
			System.out.println("record successfully saved");
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
