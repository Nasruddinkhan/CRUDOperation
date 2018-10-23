package com.user.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;



public class DBConnection
{
	
	private static Properties prop = new Properties();
	private static InputStream dbProperties = null;
	private static java.sql.Connection connection  = null;

	
	public static java.sql.Connection getConnection()
	{
		try
		{
		/*	dbProperties = new FileInputStream("src/resources/database.properties");
			prop.load(dbProperties);
			Class.forName(prop.getProperty("database.driver"));
			connection = DriverManager.getConnection(prop.getProperty("database.url"), prop.getProperty("database.user"), prop.getProperty("database.password"));
		*/
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedet","root","root");
		}
		catch (Exception e) 
		{
			System.out.println("DBConnection.getConnection() :::"+e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			if (dbProperties != null) {
				try {
					dbProperties.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return connection;
	}
	  public static void main(String[] args)
	  {
		  System.out.println(DBConnection.getConnection());
	  }
}
