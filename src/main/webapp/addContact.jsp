<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="component/allCss.jsp" %>
</head>
<body style="background-color:#f7faf8;">
<%@include file="component/navbar.jsp" %>
<div class="container-fluid">
<div class="row p-2">
<div class="col-md-6 offset-md-3">
<div class="card">
<div class="card-body">
<h4 class="text-center text-success">AddContact Page</h4>
<form action="addContact" method="post">
<div class="form-group">
<label>Enter Name</label><input name="name" type="text" class="form-control">
</div>
<div class="form-group">
<label>Enter Email</label><input name="email" type="email" class="form-control">
</div>
<div class="form-group">
<label>Enter Phone No.</label><input name="phone" type="text" class="form-control">
</div>
<div class="form-group">



<textarea rows="3" cols="3" placeholder="Enter about" name="about" class="form-control"></textarea>

</div>
<div class="text-center mt-2">
<button type="submit" class="btn btn-primary">Save Contact</button>
</div>
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>