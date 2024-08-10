<%@page import="servlet_proj1.dao.Studentdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Studentdto> list=(List<Studentdto>) request.getAttribute("abc"); %>

<table border="">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mail</th>
<th>DOB</th>
<th>Phone_No</th>
<th>Country</th>
<th>Gender</th>
<th>Delete</th>
<th>Edit</th>

</tr>
<%for(Studentdto l:list) {%>   
<tr>

<td><%=l.getId() %></td>
<td><%=l.getName() %></td>  
<td><%=l.getMail() %></td>
<td><%=l.getDob() %></td>
<td><%=l.getNumber() %></td>
<td><%=l.getCountry() %></td>
<td><%=l.getGender() %></td>
<td><a href="did?pk=<%=l.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=l.getId()%>&&name=<%=l.getName()%>&&country=<%=l.getCountry()%>&&dob=<%=l.getDob()%>&&gender=<%=l.getGender()%>&&mail=<%=l.getMail()%>&&number=<%=l.getNumber()%>">edit</a>
</tr>
<%} %>

</table>

</body>
</html>