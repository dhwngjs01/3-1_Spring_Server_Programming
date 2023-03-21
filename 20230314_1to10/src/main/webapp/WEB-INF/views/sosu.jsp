<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>sosu</title>
</head>
<body>
	<%
		for(int i = 2; i <= 1000; i++){
			boolean sosuFlag = true;
			
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					sosuFlag = false;
					break;
				}
			}	
			
			if(sosuFlag == true){
				out.print(i + "<br>");
			}
		}
	%>
</body>
</html>