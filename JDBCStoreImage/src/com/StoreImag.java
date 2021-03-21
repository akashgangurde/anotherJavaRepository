package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreImag {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagestore", "root", "");
	PreparedStatement ps=con.prepareStatement("insert into img values(?,?)");  
	ps.setInt(1,101);  
	FileInputStream fin=new FileInputStream("E:\\demoimage.jpg");  
	ps.setBinaryStream(2,fin,fin.available());  
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	          con.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
