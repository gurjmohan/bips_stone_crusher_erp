package com.bips.admin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bips.common.DriverConnection;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
private	PreparedStatement ps=null;
private String myContextParam =null;
   private Connection con=null;
   private String userName="";
   private String role="";
   private String empId="";
   private String mobileNo="";
   private String email="";
    
   /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig servletConfig) throws ServletException
    {
    	System.out.println("In init");

    	String fileName = servletConfig.getInitParameter("configFile");
    	System.out.println(fileName);


    File file=new File(fileName);

    InputStream in = servletConfig.getServletContext().getResourceAsStream(fileName);


    con=DriverConnection.getConnection(in);		
    	
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In doPost");
        if(con!=null){
		myContextParam =  request.getSession().getServletContext().getInitParameter("constantFilePath");
		System.out.println(myContextParam);

		addEmployee(request,response);		
}
else{
	System.out.println("not able to connect to DB");
}
	}
	
	public void addEmployee(HttpServletRequest request, HttpServletResponse response){
		if(request!=null && request.getParameter("txtName")!=null && !request.getParameter("txtName").equals(""))
		{
			userName=request.getParameter("txtName");
		}
		
		if(request!=null && request.getParameter("txtEmpId")!=null && !request.getParameter("txtEmpId").equals(""))
		{
			empId=request.getParameter("txtEmpId");
		}
		
		if(request!=null && request.getParameter("txtMobile")!=null && !request.getParameter("txtMobile").equals(""))
		{
			mobileNo=request.getParameter("txtMobile");
		}
		 
		if(request!=null && request.getParameter("txtEmail")!=null && !request.getParameter("txtEmail").equals(""))
		{
			email=request.getParameter("txtEmail");
		}
		
		
		if(request!=null && request.getParameter("txtRole")!=null && !request.getParameter("txtRole").equals(""))
		{
			role=request.getParameter("txtRole");
		}

	}

}
