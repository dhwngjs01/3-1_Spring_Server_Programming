<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<html>
<head>
	<title>lotto</title>
</head>
<body>
	<h2>로또 추첨</h2>
	<%
		Random r = new Random();
	
		int lottoLen = 6;
		int[] lottoArr = new int[lottoLen];
		
		int lottoNum = 0;
		boolean overlap = false;
		
		int lottoChooseCount = 0;
		while(true){
			overlap = false;
			lottoNum = r.nextInt(45) + 1;
			
			for(int j = 0; j < lottoChooseCount; j ++){
				if(lottoArr[j] == lottoNum){
					out.print((j+1) + "번째 번호가 중복되었습니다. <br>");
					overlap = true;
					continue;
				}
			}
			
			if(overlap == false){
				lottoArr[lottoChooseCount] = lottoNum;
				lottoChooseCount++;
			}
			
			if(lottoChooseCount == 6){
				break;
			}
		}
		
		for(int i = 0; i < lottoArr.length; i++){
			out.print((i+1) + "번째 번호 : " + lottoArr[i] + "<br>");
		}
	%>
</body>
</html>