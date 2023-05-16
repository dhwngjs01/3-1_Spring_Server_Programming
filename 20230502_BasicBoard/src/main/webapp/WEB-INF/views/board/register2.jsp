<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<b><center>게시글 등록</center></b>
<form method="post">
	<div>
		<label>제목</label>
		<input type="text" name="title">
		<br>
	</div>
	<div>
		<label>내용</label>
		<textarea name="content" rows="5"></textarea>
		<br>
	</div>
	<div>
		<label>글쓴이</label>
		<input type="text" name="writer">
		<br>
	</div>
	<div>
		<button type="submit">저장</button>
		<br>
	</div>
</form>

<%@include file="../include/footer.jsp"%>
