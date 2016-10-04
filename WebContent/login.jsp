<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validate()
{
    //var user = document.getElementById("user");
    //var pwd = document.getElementById("pass");
    var user = document.forms["loginForm"]["empId"].value;
    var pass = document.forms["loginForm"]["pass"].value;
    var valid =true;
    if(user==null || user=="" || pass==null || pass=="")
        {
            alert("Don't leave the fields empty!");
             valid = false;
              return valid;
        }
    
    return valid;
    
        };


        </script>
<link href="../stylesheet/bips_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
       <jsp:include page="/Header.jsp"></jsp:include>
    <section>
<div id="bips_container_sec">
 <form name="loginForm" id="loginForm" action ="login" onsubmit="return validate();" method="POST" >
     <table><tr>
     <td> <b> Employee Id: </b>  </td>
     <td><input type="text" name="empId" id="empId" class="kk" placeholder="Employee Id" value="" /></td></tr>
      <tr><td><b> Password:</b></td>
      <td>  <input type="Password" name="pass" id="pass" class="kk" placeholder="Password" value="" /></td></tr>
         <tr><td colspan="2"><button type="submit">Submit</button></td></tr>
<tr><td colspan="2">
<h3><a href="ForgetPassword.jsp"> Forget Password</a></h3></td></tr>

<tr><td colspan="2">
<h3><a href="SetPin.jsp">First Time User?</a></h3></td></tr>
<tr><td colspan="2"><input type="checkbox" class="rem" name="n" id="l" value="Remember Password"/><p class="jojo"><strong>Remember Password</strong></p></td></tr>
<tr><td colspan="4">${message}</td></tr>
</table>
        </form>

</div>
</section>
          <jsp:include page="/Footer.jsp"></jsp:include>

</body>
</html>