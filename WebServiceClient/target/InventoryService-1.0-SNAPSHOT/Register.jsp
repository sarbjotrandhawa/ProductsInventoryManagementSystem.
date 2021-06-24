
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>Register</title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		</head>
		<body>
			<div class="container">
				<h2 style="color: red;">
					<%
						if(null!=request.getAttribute("errorMessage"))
						{
							out.println(request.getAttribute("errorMessage"));
						}
					%>
				</h2>
				
				<h2>Register User</h2>
				<form action="RegisterServlet" method="post">
					<div class="form-group">
						<label for="username">Username</label>
						<input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required="">
					</div>
					<div class="form-group">
						<label for="pwd">Password</label>
						<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required="">
					</div>
					<div class="form-group">
						<label for="email">Email</label>
						<input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required="">
					</div>
					<div class="form-group">
						<label for="userRole">UserRole:</label>
						<select name="userRole" id="userRole">
							<option value="Admin">Admin</option>
							<option value="User">User</option>
						</select>
					</div>
					
					<button type="submit" class="btn btn-default">Register User</button>
				</form>
				<br/>
				<a href="index.jsp" class="btn btn-default">Login</a>
			 </div>
		</body>
	</html>
