<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Database</title>
</head>
<body>
	<h1>Movie Database</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Comments</th>
		</tr>
		<c:forEach var="row" items="${rows}">
			<tr>
				<td><c:out value="${row.title}" /></td>
				<td><c:out value="${row.Year}" /></td>
				<td><c:out value="${row.country}" /></td>
                <td><c:out value="${row.region}" /></td>
				<td>
					<form action="add_comment.jsp" method="post">
						<input type="hidden" name="id" value="${row.id}" />
						<input type="text" name="comment" />
						<input type="submit" value="Add Comment" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
