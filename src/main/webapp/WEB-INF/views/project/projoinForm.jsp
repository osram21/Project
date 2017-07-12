<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="resources/common.css">
<%@ include file="../include/header.jsp"%>
<section>
	<form action="register" method="post">
		<p>
			<label>프로젝트 이름</label>
			<input type="text" name="project_name">
		</p>
		<p>
			<label>프로젝트 내용</label>
			<textarea rows="20" cols="20" name="project_content"></textarea>>
		</p>
		<p>
			<label>시작날짜</label>
			<input type="date" name="startDate">
		</p>
		<p>
			<label>마감날짜</label>
			<input type="date" name="endDate">
		</p>
		<p>
			<label>상태</label>
				<select name="projecting">
					<option>준비</option>
					<option>진행중</option>
					<option>종료</option>
					<option>보류</option>
				</select>
		</p>
		<input type="submit" value="저장"><!-- onclick="btnClick()" -->
		<input type="reset" value="취소">
	</form>
	</section>
<!-- <script type="text/javascript">
	function btnClick() {
		location.href="listAll";
	}
</script> -->
<%@ include file="../include/footer.jsp"%>
