<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<%@ include file="include/header.jsp" %>
	
	<h1>Hello world!</h1>
	<p>The time on the server is ${serverTime}.</p>
	
	<%@ include file="include/footer.jsp" %>
</body>
</html>