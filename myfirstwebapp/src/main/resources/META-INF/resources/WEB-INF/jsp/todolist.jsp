       <%@ include file="common/header.jspf" %>
  <%@ include file="common/navegation.jspf" %>
     
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
	




 <%@ include file="common/footer.jspf" %>

</body>
</html>