<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>

		<style>
			.row {
				display:flex;
				justify-content:center;
				margin-top:5rem;
			}
			
			.table thead tr th {
				font-size:2.2rem;
			}
			
			.table tbody tr td {
				font-size:2rem;
			}
		</style>

		<div class="box">
			<h1 class="text-center">게시글 목록</h1>
			<div class="row">
				<div class="col-md-8">
					<table class="table text-center">
						<thead>
							<tr>
								<th>BNO</th>
								<th>제 목</th>
								<th>글쓴이</th>
								<th>등록시간</th>
								<th>조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="boardVO">
								<tr>
									<td>${boardVO.bno}</td>
									<td><a href="/board/read?bno=${boardVO.bno} ">${boardVO.title}</a></td>
									<td>${boardVO.content}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" /></td>
									<td>${boardVO.viewcnt}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>			
			</div>
		</div>
		
	<!-- // content-wrapper -->
	</div>
<%@include file="../include/footer.jsp"%>
