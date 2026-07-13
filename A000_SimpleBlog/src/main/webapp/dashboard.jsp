<%@page import="model.Blog"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
    
        
       <div class="contanier">
             <div class="row">
             <div class=" col-8 mx-auto mt-3 p-5 card">
             <h2 >Blog Datalis</h2>
             <a  href="create.jsp" class="btn btn-success">Create Blog</a>
             <hr>
             <table class="table">
             <tr>
             <th>Id</th>
             <th>Title</th>
             <th>Content</th>
             <th>Tags</th>
             <th>User</th>
             <th colspan="2">Action</th>
             </tr>
             
             <%
             ArrayList<Blog> al=(ArrayList)request.getAttribute("data");
             for(Blog b: al)
             {%>
            	 
            	 <tr>
                 <td><%=b.getId() %></td>
                 <td><%=b.getTitle() %></td>
                 <td><%=b.getContent() %></td>
                 <td><%=b.getTags() %></td>
                 <td><%=b.getUser().getId() %></td>
                 <td><a href="delete?id=<%=b.getId()%>" class="btn btn-danger" >Delete</a></td>
                 </tr>
             <% }
             %>
             </table>
             </div>
             </div>
       </div>

</body>
</html>