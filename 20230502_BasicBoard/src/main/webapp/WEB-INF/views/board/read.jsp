<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>


<style>
	.row {
		display:flex;
		justify-content:center;
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

				<form role="form" method="post">
					<input type='hidden' name='bno' value="${boardVO.bno}">
				</form>
				
				<div class="box-body">
					<div class="form-group">
						<label>제목</label>
						<p>${boardVO.title}</p>
					</div>
					<div class="form-group">
						<label>내용</label>
						<p>${boardVO.content}</p>
					</div>
					<div class="form-group">
						<label>작성자</label>
						<p>${boardVO.writer}</p>
					</div>
				</div>
				<!-- /.box-body -->
				
				<div class="box-footer text-right">
					<a href="/board/modify?bno=${boardVO.bno}" class="btn btn-warning">수정</a>
					<a href="/board/remove?bno=${boardVO.bno}" class="btn btn-danger">삭제</a>
					<a href="/board/listAll" class="btn btn-primary">목록</a>
				</div>


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
