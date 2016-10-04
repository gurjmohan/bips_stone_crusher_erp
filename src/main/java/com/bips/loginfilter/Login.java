package com.bips.loginfilter;
import javax.servlet.*;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.bips.common.DriverConnection;

import java.sql.*;
import java.util.Properties;

public class Login extends HttpServlet
{
private	PreparedStatement ps=null;
private Connection con=null;
String queryFilePath;
private String empId;
String query; 
public void init(ServletConfig servletConfig) throws ServletException
{
	System.out.println("In init");

	String fileName = servletConfig.getInitParameter("configFile");
	System.out.println(fileName);



InputStream in = servletConfig.getServletContext().getResourceAsStream(fileName);


con=DriverConnection.getConnection(in);		
	
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) {
	
	System.out.println("In doPost");

	
boolean flag=false;
if(con!=null)
{
	flag=true;
	
}
else{
	flag=false;
}
try{	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
 
if(flag){
	

	empId=request.getParameter("empId");
	boolean authenticatedEmployee=authenticateEmployee(request,response);
    if(authenticatedEmployee){
    	
       request.setAttribute("empId",empId);
		RequestDispatcher rd=request.getRequestDispatcher("Admin/Admin.jsp");
		rd.forward(request,response);
    }		
	else	
	{
		String message = "Unauthenticated empId";
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.include(request,response);
		
	}

	

}

else
{
out.println("<html><body>"); 
out.println("Connection not created"); 
out.println("</body></html>"); 

RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
rd.include(request,response);

}	
}
	 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


}

public boolean authenticateEmployee(HttpServletRequest request, HttpServletResponse response){
	boolean flag=false;
	queryFilePath =  request.getSession().getServletContext().getInitParameter("queryFilePath");
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	String pass=null;
    try {
    	if(request!=null && request.getParameter("empId")!=null && !request.getParameter("empId").equals("") && request.getParameter("pass")!=null && !request.getParameter("pass").equals("") )
    	{

    		empId=request.getParameter("empId");
            pass=request.getParameter("pass");    	
    	InputStream in = request.getSession().getServletContext().getResourceAsStream(queryFilePath);
    	Properties p=new Properties();
    	p.load(in);
      query=  p.getProperty("EMPLOYEE_AUTH_QUERY");
		ps1=con.prepareStatement(query);

	    ps1.setString(1, empId);
	    ResultSet rs1=ps1.executeQuery();
	    if(rs1!=null){
	    	flag=true;
	    }
	    else{
	    	flag=false;
	    }
	    query=  p.getProperty("EMPLOYEE_PASSWORD_AUTH_QUERY");
	  		ps2=con.prepareStatement(query);
	  	    ps2.setString(1, empId);
	  	  ps2.setString(2, pass);
	  		ResultSet rs2=ps2.executeQuery();	    
	    if(rs2!=null){
	    	flag=true;
	    }
	    else{
	    	flag=false;
	    }
    	}
    	
    	
    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	return flag;
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	// TODO Auto-generated method stub
//}

}