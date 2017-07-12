<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="resources/common.css">
<%@ include file="../include/header.jsp"%>
	<section>
	<form action="modify" method="post">
	<input type="hidden" name="project_no" value="${project.project_no }">
		<p>
			<label>프로젝트 이름</label>
			<input type="text" name="project_name" value="${project.project_name }">
		</p>
		<p>
			<label>프로젝트 내용</label>
			<textarea rows="20" cols="20" name="project_content">${project.project_content }</textarea>
		</p>
		<p>
			<label>시작날짜</label>
			<input type="date" name="startDate" value="${project.startDate }">
		</p>
		<p>
			<label>마감날짜</label>
			<input type="date" name="endDate" value="${project.endDate }">
		</p>
		<p>
			<label>상태</label>
				<select name="projecting" value="${project.projecting }">
				 <c:if test="${project.projecting == '준비'}">
					<option value="준비" selected="selected">준비</option>
					<option value="진행중">진행중</option>
					<option value="종료">종료</option>
					<option value="보류">보류</option>
					</c:if>
					<c:if test="${project.projecting == '진행중'}">
					<option value="준비">준비</option>
					<option value="진행중" selected="selected">진행중</option>
					<option value="종료">종료</option>
					<option value="보류">보류</option>
					</c:if>
					<c:if test="${project.projecting == '종료'}">
					<option value="준비">준비</option>
					<option value="진행중">진행중</option>
					<option value="종료" selected="selected">종료</option>
					<option value="보류">보류</option>
					</c:if>
					<c:if test="${project.projecting == '보류'}">
					<option value="준비">준비</option>
					<option value="진행중">진행중</option>
					<option value="종료">종료</option>
					<option value="보류" selected="selected">보류</option>
					</c:if>
				</select>
		</p>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
	</form>
	</section>
<%@ include file="../include/footer.jsp"%>