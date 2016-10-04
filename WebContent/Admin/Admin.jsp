<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../stylesheet/bips_style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <jsp:include page="/Header.jsp"></jsp:include>   
  <section>
<div id="bips_container_sec">
<div class="subdiv">

<%=request.getAttribute("empId")%>


<a href="AddEmployee.jsp"><h1>Add Employee</h1></a>
<a href="Mining.jsp"><h1>Mining</h1></a>
<a href="Sales.jsp"><h1>Mining</h1></a>
<a href="Inventory.jsp"><h1>Mining</h1></a>

</div>
</div>
</section>
   <footer>
<div id="bips_container_fot">
<p><i><strong>Copyright &copy; 2016 -BIPS PVT LTD &middot; All Rights Reserved<strong></i></p>
</div>
</footer>

</body>
</html>