<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
     <div class="container">
     <div class = "row">
	<div class ="col-5 mx-auto mt-3 p-5 card">
	<h2>Login User</h2>
	<hr>

     <form action="login" method="post">
     <input type="email" name="email" placeholder="enter email" class ="form-control">
     <br>
     <input type="password" name="passWord" placeholder="enter passWord" class ="form-control">
     <br>
     <input type="submit" class="btn btn-success">
     
     </form>
     </div>
     </div>
     </div>
</body>
</html>