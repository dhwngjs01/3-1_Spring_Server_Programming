<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

	<style>
		.row {
			display:flex;
			justify-content:center;
		}
		
		.form-control[readonly] {
			background-color:#fff;
		}
		
		textarea.form-control {
			resize: none;
		}
	</style>

	<h3 class="text-center">게시글 열람</h3>
	<div class="row">
		<div class="col-md-5">
			<div class="form-group">
				<label for="input-title">제 목</label>
				<input type="text" value="${boardVO.title}" id="input-title" class="form-control" readonly>
			</div>
			<div class="form-group">
				<label for="input-content">내 용</label>
				<textarea rows="5" id="input-content" class="form-control" readonly>${boardVO.content}</textarea>
			</div>
			<div class="form-group">
				<label for="input-writer">글쓴이</label>
				<input type="text" value="${boardVO.writer}" id="input-writer" class="form-control" readonly>
			</div>
		</div>
	</div>
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
