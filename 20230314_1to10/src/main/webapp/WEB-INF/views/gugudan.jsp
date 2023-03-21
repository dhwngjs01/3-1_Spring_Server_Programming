<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>gugudan</title>
</head>
<body>
	<h1>Hello world!</h1>
	
	<h2 style="text-align:center;">구구단</h2>
	
	<table style="border:1px solid black">
		<tbody>
			<% for(int i = 1; i <= 9; i++){ %>
			<tr>
				<% for(int j = 1; j <= 9; j++){ %>
				<td style="border:1px solid black"><% out.print(j + " X " + i + " = " + i*j); %></td>
				<% } %>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>