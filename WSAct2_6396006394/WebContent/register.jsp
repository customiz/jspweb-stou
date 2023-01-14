<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Prompt&display=swap"
	rel="stylesheet">
<style type="text/css">
html * {
	font-family: 'Prompt', sans-serif;
}
</style>
</head>
<body>

	<div class="col-lg-8 mx-auto p-4 py-md-5">


		<main class="form-signin w-100 m-auto">
		<form action="auth" method="post">
			<div class="text-center">
				<a href="index.jsp"> <img class="mb-4"
					src="https://www.stou.ac.th/main/images/index/STOU_r.png" alt=""
					height="120">
				</a>
			</div>
			<h1 class="h3 mb-3 fw-normal">Register Form</h1>


			<div class="form-floating">
				<input type="text" class="form-control" id="firstname"
					placeholder="firstname" name="firstname"> <label
					for="firstname">Firstname</label>
			</div>
			<div class="checkbox mb-3"></div>
			<div class="form-floating">
				<input type="text" class="form-control" id="lastname"
					placeholder="lastname" name="lastname"> <label
					for="lastname">Lastname</label>
			</div>
			<div class="checkbox mb-3"></div>
			<div class="form-floating">
				<input type="text" class="form-control" id="nameinput"
					placeholder="Username" name="username" reqiured> <label
					for="nameinput">Username</label>
			</div>
			<div class="checkbox mb-3"></div>
			<div class="form-floating mt-20">
				<input type="password" class="form-control" id="lastnameinput"
					placeholder="Password" name="password" reqiured> <label
					for="lastnameinput">Password</label>
			</div>

			<div class="checkbox mb-3"></div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">Register</button>
			<span>Have a member ? <a href="login.jsp">Login</a></span>
			<p class="mt-5 mb-3 text-muted">&copy; 6396006394 - นายก่อเกียรติ
				ทันเขิม</p>
		</form>


		</main>

	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</html>