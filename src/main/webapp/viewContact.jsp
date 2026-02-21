<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Contact"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Contacts</title>
<%@ include file="component/allCss.jsp"%>
</head>
<body style="background-color:#f7faf8;">
<%@ include file="component/navbar.jsp"%>
<div class="container mt-3">
<h3 class="text-center">Your Contacts</h3>
<table class="table table-bordered table-striped">
<thead>
<tr class="table-primary text-center">
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phn</th>
<th>About</th>
</tr>
</thead>
<tbody>
<%
List<Contact> list = (List<Contact>) request.getAttribute("contactList");

if (list != null && !list.isEmpty()) {
for (Contact c : list) {
%>
<tr>
<td><%= c.getId() %></td>
<td><%= c.getName() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getPhno() %></td>
<td><%= c.getAbout() %></td>
</tr>
<%
}
} else {
%>
<tr>
<td colspan="5" class="text-center text-danger">No contacts found!</td>
</tr>
<%
}
%>
</tbody>
</table>
</div>
</body>
</html>