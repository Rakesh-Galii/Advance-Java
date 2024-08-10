<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
    <input type="number" value="<%=request.getParameter("id")%>" name="sid"> <br>
	<input type="text" value="<%=request.getParameter("name")%>" name="sname"> <br>
	
	<input type="email" value="<%=request.getParameter("mail")%>" name="semail"> <br>
	<input type="date" value="<%=request.getParameter("dob")%>" name="sdob"> <br>
	<input type="number" value="<%=request.getParameter("number")%>" name="snumber"> <br>
	Male<input type="radio" value="female" name="gender"> <br>
	Female<input type="radio" value="male" name="gender"> <br>
	
	Country:<select name="scountry">
	<option></option>
	<option>India</option>
	<option>USA</option>
	<option>UK</option>
	
	</select> <br>
	<button>submit</button>
	</form>

</body>
</html>