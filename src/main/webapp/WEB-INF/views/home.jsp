<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table, thead, tbody, tfoot, th, tr, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	table{
		width: 680px;
	}
</style>
<title>게시글 전체</title>
</head>
<script type="text/javascript">
	function detail(seq){
		location.href = "./detail?mig_seq="+seq;
	}
</script>
<body>
<div style="text-align: center; width: 900px;">
	<div style="margin: 0 auto; width: 700px;">
		<table>
			<thead>
				<tr>
					<td style="width: 15%;">글 번호</td>
					<td style="width: 60%;">제목</td>
					<td style="width: 25%;">작성자</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty list}">
						<tr>
							<td style="color: red;" colspan="3"> -- 게시글이 없습니다 --</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="board" items="${list}">
							<tr>
								<td>${board.mig_seq}</td>
								<td><a onclick="detail('${board.mig_seq}')">${board.mig_title}</a></td>
								<td>${board.mig_writer}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3">
						<a href="./insert">글 작성</a>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
</div>
</body>
</html>