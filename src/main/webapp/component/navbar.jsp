<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
String ctx = request.getContextPath();
boolean loggedIn = (session.getAttribute("user") != null);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Phone Book</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">

    <a class="navbar-brand" href="<%=ctx%>/index.jsp">Phone Book</a>

    <!-- Mobile Toggle Button -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
            data-bs-target="#navbarNav" aria-controls="navbarNav" 
            aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Collapsing Menu -->
    <div class="collapse navbar-collapse" id="navbarNav">

      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" href="<%=ctx%>/index.jsp">Home</a>
        </li>

        <li class="nav-item">
          <a class="nav-link" href="<%=ctx%>/addContact.jsp">Add Contact</a>
        </li>

        <li class="nav-item">
          <a class="nav-link" href="<%=ctx%>/viewContact">View Contact</a>
        </li>
      </ul>

      <!-- Right Side Buttons -->
      <div class="ms-auto d-flex align-items-center">

        <% if (!loggedIn) { %>
          <a href="<%=ctx%>/login.jsp" class="btn btn-success me-2">Login</a>
          <a href="<%=ctx%>/register.jsp" class="btn btn-danger">Register</a>
        <% } else { %>
          <span class="navbar-text text-white me-3">
            Hello, ${sessionScope.user.name}
          </span>
          <a href="<%=ctx%>/logout" class="btn btn-warning">Logout</a>
        <% } %>

      </div>

    </div>
  </div>
</nav>

<!-- Bootstrap JS (needed for mobile menu to open) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
