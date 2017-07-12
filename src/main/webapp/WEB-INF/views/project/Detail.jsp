<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css" href="resources/common.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<%@ include file="../include/header.jsp"%>
	<section>
	<table border="1">
		<tr>
			<th>프로젝트 이름</th>
			<td>${project.project_name }</td>
		</tr>
		<tr>
			<th>프로젝트 내용</th>
			<td>${project.project_content }</td>
		</tr>
		<tr>
			<th>시작 날짜</th>
			<td><fmt:formatDate value="${project.startDate }"/></td>
		</tr>
		<tr>
			<th>종료 날짜</th>
			<td><fmt:formatDate value="${project.endDate }"/></td>
		</tr>
		<tr>
			<th>상태</th>
			<td>${project.projecting }</td>
		</tr>
	</table>
	
	<p>
		 <a href="#" id="update">수정</a><%-- modify?project_no=${project.project_no } --%>
		<a href="#" id="del">삭제</a>
		<a href="#" id="list">리스트보기</a> 
	</p>
		<form action="form" id="f1" method="post">
			<input type="hidden" name="project_no" value="${project.project_no }">
		</form>
	</section>
<script type="text/javascript">
	$(function() {
		 $("#del").click(function(e){
	         e.preventDefault();//link막음
	         if(confirm("삭제하시겠습니까?")){
	             $("#f1").attr("action","delete"); //post형식의 delete커맨드 호출됨
	             $("#f1").submit();
	          }else{
	             alert("취소됨");
	          }
	      });
		   $("#update").click(function(event) {
		         event.preventDefault();
		         $("#f1").attr("action","modify");
		         $("#f1").attr("method","get");
		         $("#f1").submit();
		      });
		   $("#list").click(function(event) {
		         event.preventDefault();
		         $("#f1").attr("action","listAll");
		         $("#f1").attr("method","get");
		         $("#f1").submit();
		         
		      });
		
	});
	 /* function btnClick(){
		 location.href="listAll";
	 } */
</script> 
<%@ include file="../include/footer.jsp"%>	
