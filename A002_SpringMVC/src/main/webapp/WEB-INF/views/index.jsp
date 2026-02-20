<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> home </title>
</head>
<body>
       
       <form:form action="addStudent" method="post" modelAttribute="st">
       <form:hidden path="id"/>
       <form:label path="name">Name</form:label>
       <form:input path="name"/>
       <form:label path="email">Email</form:label>
       <form:input path="email"/>
       <form:label path="phone">Phone</form:label>
       <form:input path="phone"/>
       <input type="submit">
       </form:form>
       
       <br>
       <br>
       <hr>
       <br>
       
       <table border="1">
       <tr>
       <th>Id</th>
       <th>Name</th>
       <th>Eamil</th>
       <th>Phone</th>
       <th>Action</th>
       </tr>	
      
       
       <c:forEach items="${students}" var="st">
        <tr>
       <td>${st.getId() }</td>
       <td>${st.getName()} </td>
       <td>${st.getEmail()} </td>
       <td>${st.getPhone() }</td>
       <td><a href="delete?id=${st.getId() }">Delete</a></td>
       <td><a href="edit?id=${st.getId() }">Edit</a></td>
       </tr>
       </c:forEach>
       </table>
</body>
</html>