<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table, th, tr, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	table{
		width: 680px;
	}
</style>
<title>글 수정하기</title>
<script type="text/javascript">
	function backList(){
		history.go(-1);
	}
</script>
</head>
<body>
<div style="text-align: center; width: 900px;">
	<div style="margin: 0 auto; width: 700px;">
	<form action="./updating" method="post">
		<input type="hidden" name="mig_seq" value="${board.mig_seq}">
		<table>
			<tr>
				<th width="15%">제목</th>
				<td width="85%"><input type="text" name="mig_title" value="${board.mig_title}"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${board.mig_writer}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="mig_content" rows="7" cols="50">${board.mig_content}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">　
					<input type="button" value="뒤로가기" onclick="backList()">
				</td>
			</tr>
		</table>
	</form>
	</div>
</div>
</body>
</html>