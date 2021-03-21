package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/storeimage", "root", "");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into imgtable values(?,?)");
			preparedStatement.setInt(1, 101);
			
			FileInputStream fileInputStream = new FileInputStream("E:\\demoimage.jpg");
			preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records affected");
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
