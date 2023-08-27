 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome Page</title>
</head>
<body>
     <h1>Welcome ${name}</h1>
     <hr>
     <h2>Your Todos</h2>



	
	<table>
	<thead>
	
	<tr>
	
	<th>Id</th>
	<th>Description</th>
	<th>TargetDate</th>
	<th>Is Done?</th>
	
	</tr>
	
	</thead>
	<tbody>
	<c:forEach items="${todos}" var="todo">
	
	<tr>
	
	<td>${todo.id}</td>
	<td>${todo.description}</td>
	<td>${todo.targetDate}</td>
	<td>${todo.done}</td>
	</tr>
	
	
	
	
	</c:forEach>
	</tbody>
	
	
	</table>
	





</body>
</html>