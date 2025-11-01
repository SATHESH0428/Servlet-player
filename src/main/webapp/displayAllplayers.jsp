<%@page import="com.jsp.servlet.playerdb.Entity.Player"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<Player> players=(List)request.getAttribute("player");%>
<table border="">
<tr>
<th>PlayerId</th>
<th>Title</th>
<th>Age</th>
<th>Nationality</th>
<th>Team</th>
<th>Salary</th>
<th>Update</th>
<th>Delete</th>

</tr>
<% for(Player player:players){ %>

<tr>
<td><%=player.getPlayerid() %></td>
<td><%=player.getTitle() %></td>
<td><%=player.getAge() %></td>
<td><%=player.getNationality() %></td>
<td><%=player.getTeam() %></td>
<td><%=player.getSalary() %></td>

<td><a href="find-by-id?playerId=<%=player.getPlayerid() %>">Update</a></td>
<td><a href="delete-by-id?playerId=<%=player.getPlayerid() %>">Delete</a></td>

</tr>
<%} %>
</table>
<h2><a href="index.jsp">Go back to dashboard</a></h2>
</body>
</html>