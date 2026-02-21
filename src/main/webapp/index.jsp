<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PhoneBook App</title>

<%@ include file="component/allCss.jsp" %>

<style>
.back-img {
    background-image: url('<%=request.getContextPath()%>/img/phone(1).jpg');
    background-size: cover;
    background-position: center;
    width: 100%;
    height: 83vh;
    position: relative;
}

.hero-heading {
    position: absolute;
    top: 40%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 52px;
    font-weight: 700;
    color: red;
    text-shadow: 3px 3px 10px black;
}
</style>

</head>
<body>

<%@ include file="component/navbar.jsp" %>

<div class="back-img">
    <h1 class="hero-heading">Welcome to PhoneBook </h1>
</div>

<%@ include file="component/footer.jsp" %>

</body>
</html>