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
<title>글 작성</title>
</head>
<script type="text/javascript">
	function backList(){
		history.go(-1);
	}
</script>
<body>
<div style="text-align: center; width: 900px;">
	<div style="margin: 0 auto; width: 700px;">
		<form action="./inserting" method="post">
			<table>
				<tr>
					<th width="15%">제목</th>
					<td width="85%"><input type="text" name="mig_title"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="mig_writer"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="7" cols="50" name="mig_content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="작성완료">　
						<input type="button" value="뒤로가기" onclick="backList()">
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>