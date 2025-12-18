<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Book</title>
</head>
<body>

      <form action="author" method="post">
      ${msg}
      <input type="text" name="name" placeholder="enter name">
      <input type="text" name="Qty" placeholder="enter Qty">
      <input type="text" name="price" placeholder="enter price">
      <input type="submit">
      </form>
</body>
</html>