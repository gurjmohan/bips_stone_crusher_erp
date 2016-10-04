package com.bips.common;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DriverConnection
 */
@WebServlet("/DriverConnection")
public class DriverConnection extends HttpServlet {
	public static Connection con=null;
	public static Connection getConnection(InputStream fis){
		Properties prop = new Properties();
	    
		   String jdbcDriver= "";  
		   String url = "";
		   String user = "";
		   String pass = "";
		   
	try {

		   prop.load(fis);
		   jdbcDriver=prop.getProperty("DRIVER");
	 url=prop.getProperty("URL");
	 user=prop.getProperty("USER");
	 pass=prop.getProperty("PASS");
		   Class.forName(jdbcDriver);
	 
	 
	System.out.println("Connecting to database...");
	con = (Connection) DriverManager.getConnection(url,user,pass);

	return con;
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
		
	finally{
		return con;
	}
		
	}
}
