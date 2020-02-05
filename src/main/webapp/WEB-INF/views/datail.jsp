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
<title>게시글 상세</title>
<script type="text/javascript">
	function updateBoard(mig_seq){
		location.href = "./update?mig_seq="+mig_seq;	
	}
	
	function deleteBoard(mig_seq){
		location.href = "./delete?mig_seq="+mig_seq;
	}
	
	function backList(){
		history.go(-1);
	}
</script>
</head>
<body>
<div style="text-align: center; width: 900px;">
	<div style="margin: 0 auto; width: 700px;">
		<table>
			<tr>
				<th width="15%">제목</th>
				<td width="85%">${board.mig_title}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${board.mig_writer}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${board.mig_content}</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="수정" onclick="updateBoard('${board.mig_seq}')">　
					<input type="button" value="삭제" onclick="deleteBoard('${board.mig_seq}')">　
					<input type="button" value="뒤로가기" onclick="backList()">
				</td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>