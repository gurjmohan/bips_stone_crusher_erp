<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
<script type="text/javascript">
function validate()
{
    //var user = document.getElementById("user");
    //var pwd = document.getElementById("pass");
    var userName = document.forms["loginForm"]["txtName"].value;
    var  empId= document.forms["loginForm"]["txtEmpId"].value;
        var mobileNo = document.forms["loginForm"]["txtMobile"].value;
        var email = document.forms["loginForm"]["txtEmail"].value;
        var role = document.forms["loginForm"]["txtrole"].value;
    var valid =true;
    if(userName==null || userName=="" || empId==null || empId=="" || mobileNo=="" || mobileNo==null || email=="" || email==null || role==null || role=="" )
        {
            alert("Don't leave the fields empty!");
             valid = false;
              return valid;
        }
    
    return valid;
    
        };


        </script>

<link href="../stylesheet/bips_style1.css" rel="stylesheet" type="text/css" />

</head>
<body>
 <jsp:include page="/Header.jsp"></jsp:include>   
  <section>
<div id="bips_container_sec">
<div class="subdiv">
 <form name="addEmployeeForm" id="addEmployeeForm" action ="addEmployee" onsubmit="return validate();" method="POST" >
<%=request.getAttribute("userName")%>
<center><h1>Add Employee</h1></center>
<table><tr><td><label id ="lblname" >User Name: </label></td>
<td><input type="text" id ="txtname" value=""/></td></tr>

<tr><td><label id ="lblEmpId">Employee Id: </label></td>
<td><input type="text" id ="txtEmpId" value=""/></td></tr>

<tr><td><label id ="lblMobile">Mobile No: </label></td>
<td><input type="text" id ="txtMobile" value=""/></td></tr>

<tr><td><label id ="lblEmail" >Email Id: </label></td>
<td><input type="text" id ="txtEmail" value=""/></td></tr>

<tr><td><label id ="lblRole">Role: </label></td>
<td><select id="role" name="rent_type" >
  <option value="">--Select</option>
    <option value="Admin">Admin</option>
    <option value="Manager">Manager</option>
    <option value="User">User</option>

    </select>
    </td>
</tr>
<tr>
<td colspan="2"><button type="submit">Submit</button></td></tr></table>
</form>
</div>
</div>
</section>
   <footer>
<div id="bips_container_fot">
<p><i><strong>
Copyright &copy; 2016 -BIPS PVT LTD &middot; All Rights Reserved
<strong></i></p>
</div>
</footer>

</body>
</html>