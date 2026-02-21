<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<%@ include file="component/allCss.jsp" %>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <h4 class="text-center text-success mt-3">Login Page</h4>
            <div class="card">
                <form action="login" method="post">

                    <div class="mb-3">
                        <label>Email Address</label>
                        <input type="email" name="email" class="form-control" required>
                    </div>

                    <div class="mb-3">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" required>
                    </div>

                    <div class="text-center mt-2">
                        <button type="submit" class="btn btn-primary">Login</button>
                    </div>

                </form>
            </div>

        </div>
    </div>
    <div style="margin-top:140 px">
    <%@include file="component/footer.jsp" %>
</div>
</div>
</body>
</html>