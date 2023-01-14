<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Payment</title>
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
	<nav class="py-2 bg-light border-bottom">
		<div class="container d-flex flex-wrap">
			<ul class="nav me-auto">
				<li class="nav-item"><a href="#"
					class="nav-link link-dark px-2 active" aria-current="page">Home</a></li>
				<li class="nav-item"><a href="product.jsp"
					class="nav-link link-dark px-2">Product</a></li>
				<li class="nav-item"><a href="cart.jsp"
					class="nav-link link-dark px-2">Cart</a></li>
				<li class="nav-item"><a href="payment.jsp"
					class="nav-link link-dark px-2">Payment</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link link-dark px-2">Contact</a></li>
			</ul>

			<%
				if (session.getAttribute("username") != null) {
			%>
			<p class="mt-2 mb-0">
				Welcome
				<%=session.getAttribute("username")%></p>

			<%
				} else {
			%>
			<ul class="nav">
				<li class="nav-item"><a href="login.jsp"
					class="nav-link link-dark px-2">Login</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link link-dark px-2">Sign up</a></li>
			</ul>
			<%
				}
			%>


		</div>
	</nav>
	<header class="py-3 mb-4 border-bottom">
		<div class="container d-flex flex-wrap justify-content-center">
			<a href="index.jsp"
				class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
				<img src="https://www.stou.ac.th/main/images/index/STOU_r.png"
				height="80"> <span class="fs-4"> Header</span>
			</a>

		</div>
	</header>

	<main class="flex-shrink-0">
	<div class="container">
		<h1 class="mt-5">Payment</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">No.</th>
					<th scope="col">id</th>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
					<th scope="col">Amount</th>
					<th scope="col">Sum</th>

				</tr>
			</thead>
			<tbody>

				<tr>
					<th scope="row">1</th>
					<td>P01</td>
					<td>Xiaomi</td>
					<td>3900</td>
					<td><%=session.getAttribute("amount1")%></p></td>
					<td><%=session.getAttribute("price1")%></p></td>

				</tr>
				<tr>
					<th scope="row">2</th>
					<td>P02</td>
					<td>Fitbit</td>
					<td>6000</td>
					<td><%=session.getAttribute("amount2")%></p></td>
					<td><%=session.getAttribute("price2")%></p></td>
				</tr>
			</tbody>
		</table>
		<h3 class="">
			Total :
			<td><%=session.getAttribute("sum")%></p></td>
		</h3>
		<a href="https://www.paypal.com/th/home" target="_blank"
			class=" btn  btn-primary" type="submit">Pay</a>


	</div>
	</main>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</html>