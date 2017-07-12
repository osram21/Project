<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../include/header.jsp"%>
<link rel="stylesheet" type="text/css" href="resources/common.css">
	<section> 
	<a href="#" id="linkOne" onclick="btnClick()">새 프로젝트 등록</a>
	<table border="1">
		<tr>
			<th>프로젝트 이름</th>
			<th>시작 날짜</th>
			<th>종료 날짜</th>
			<th>상태</th>
		</tr>
		<c:forEach var="item" items="${list }">
				<tr>
					<td><a href="read?project_no=${item.project_no }">${item.project_name }</a></td>
					<td><fmt:formatDate value="${item.startDate }"/></td>
					<td><fmt:formatDate value="${item.endDate }"/></td>
					<td>${item.projecting }</td>
				</tr>
			</c:forEach>
	</table>
		
	</section>
<script type="text/javascript">
function btnClick() {
	location.href="register";
}
</script>
<%@ include file="../include/footer.jsp"%>
