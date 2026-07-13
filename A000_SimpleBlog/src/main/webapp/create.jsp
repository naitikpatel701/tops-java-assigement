<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Blog</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

      <div class="contanier">
      <div class = "row">
	<div class ="col-5 mx-auto mt-3 p-5 card">
	<h2> Create Blog</h2>
	<hr>
	<form action="blog" method="post">
	 <input type="text" id="title" name="title" class="form-control" required placeholder="enter title">
	 <br>
	 <input type="text" id="content" name="content" class="form-control"  required placeholder="enter content">
	 <br>
	  <input type="text" id="tags" name="tags" class="form-control" placeholder="enter tags">
	  <br>
	  <input type="submit" class="btn btn-success">
	  <input type="reset" class="btn btn-primary">
	  <a href="dashboard" class="btn btn-warning">Dashboard</a>
	</form>
      </div>
      </div>
      </div>
</body>
</html>