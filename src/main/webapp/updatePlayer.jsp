<%@page import="com.jsp.servlet.playerdb.Entity.Player"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Update the Players Details.</h1><br>
<% Player player=(Player)request.getAttribute("player"); %>
<form action="UpdatePlayer" method="post">
<input type="number" value="<%=player.getPlayerid()%>" readonly="readonly" name="playerId"><br>
<input type="text" value="<%= player.getTitle() %>" name="title"><br>
<input type="number" value="<%= player.getAge() %>" name="age"><br>
<input type="text" value="<%= player.getNationality() %>" name="national"><br>
<input type="text" value="<%= player.getTeam() %>" name="team"><br>
<input type="number" value="<%= player.getSalary() %>" name="salary"><br>
<input type="submit" value="UPDATE PLAYER">
</form>


</body>
</html>