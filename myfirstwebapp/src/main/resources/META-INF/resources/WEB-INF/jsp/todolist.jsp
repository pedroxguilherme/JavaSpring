 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet" >



<title>Welcome Page</title>
</head>
<body>
     <div class="container">
     <h1>Welcome ${name}</h1>
     <hr>
     <h2>Your Todos</h2>



	
	<table class="table">
	<thead>
	
	<tr>
	
	
	<th>Description</th>
	<th>TargetDate</th>
	<th>Is Done?</th>
	<th></th>
	<th></th>
	</tr>
	
	</thead>
	<tbody>
	<c:forEach items="${todos}" var="todo">
	
	<tr>
	
	<td>${todo.description}</td>
	<td>${todo.targetDate}</td>
	<td>${todo.done}</td>
	<td><a href="todo-delete?id=${todo.id}" class="btn btn-warning">DELETE ${todo.id}</a></td>
	<td><a href="todo-update?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
	</tr>
	
	
	
	
	</c:forEach>
	</tbody>
	</table>
	<a href="todo-add" class="btn btn-success"> Add todo</a>
	</div>
	




<script src="webjars/jquery/3.7.0/jquery.min.js"> </script>
<script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>


</body>
</html>