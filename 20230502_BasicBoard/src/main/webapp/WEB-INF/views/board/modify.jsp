<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>


	<style>
		.row {
			display:flex;
			justify-content:center;
		}
		
		.bg-white {
			background-color:#fff !important;
		}
	</style>

	<!-- Main content -->
	<section class="content">
		<div class="row">
			<!-- left column -->
			<div class="col-md-6">
				<!-- general form elements -->
				<div class="box box-primary">
					<div class="box-header">
						<h3 class="box-title">게시글 조회</h3>
					</div>
					<!-- /.box-header -->
	
					<form role="form" action="/board/modify" method="post">
						<input type='hidden' name='bno' value="${boardVO.bno}">
						
						<div class="box-body">
							<div class="form-group">
								<label for="title">제목</label> 
								<input type="text" id="title" name='title' class="form-control" placeholder="Enter Title" value="${boardVO.title}">
							</div>
							<div class="form-group">
								<label for="content">내용</label>
								<textarea id="content" class="form-control" name="content" rows="3" placeholder="Enter ...">${boardVO.content}</textarea>
							</div>
							<div class="form-group">
								<label for="writer">작성자</label> 
								<input type="text" id="writer" name="writer" class="form-control bg-white" placeholder="Enter Writer" value="${boardVO.writer}" readonly>
							</div>
							</div>
						<!-- /.box-body -->
						
						<div class="box-footer text-right">
							<button type="submit" class="btn btn-warning">수정</button>
							<a href="/board/read?bno=${boardVO.bno}" class="btn btn-primary">취소</a>
						</div>
					</form>
					
					<script>
						$(document).ready(function(){
							
							var formObj = $("form[role='form']");
							
							console.log(formObj);
							
							$(".btn-warning").on("click", function(){
								formObj.attr("action", "/board/modify");
								formObj.attr("method", "get");		
								formObj.submit();
							});
							
							$(".btn-danger").on("click", function(){
								formObj.attr("action", "/board/remove");
								formObj.submit();
							});
							
							$(".btn-primary").on("click", function(){
								self.location = "/board/listAll";
							});
							
						});
					</script>
				</div>
				<!-- /.box -->
			</div>
			<!--/.col (left) -->
	
		</div>
		<!-- /.row -->
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
