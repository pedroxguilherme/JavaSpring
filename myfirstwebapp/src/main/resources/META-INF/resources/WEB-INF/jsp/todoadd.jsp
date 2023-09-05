
  <%@ include file="common/header.jspf" %>
  <%@ include file="common/navegation.jspf" %>
   <div class="container"> 
 <h1>Add Todo</h1>   
    
  <form:form method="post" modelAttribute="todo">
  
 
  <fieldset class="mb-3">
  <form:label path="description">Description</form:label>
  <form:input  type="text" path="description" required="required"/>
  </fieldset>
  <fieldset class="mb-3">
  <form:label path="targetDate"> Target Date</form:label>
  <form:input  type="text" path="targetDate" required="required"/>
  </fieldset>
  
  
  
  <form:errors path="description" cssClass="text-warning"/>
  <form:input type="hidden" path="id"/>
   <form:input type="hidden" path="done"/>
  <input type="submit" class="btn btn-success"/>
  
  
  </form:form>  
    </div>
    

 <%@ include file="common/footer.jspf" %>



</body>
</html>