<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Movie Cruiser</title>
<link href='https://fonts.googleapis.com/css?family=Amita'
	rel='stylesheet'>
<link rel="stylesheet" href="movie-list-customer-style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>

	<!-- Header section  -->
	<header>
		<div class="header">
			<a href="#" class="logo">Movie Cruiser</a>
			<div class="header-right">
				<a href="customer">Movies</a> 
				<a href="view-favorites">Favorites</a>
				 <a href="#">Logout</a>

			</div>

		</div>

	</header>

	<h2>Favorite Movies</h2>

	<div class="container">
		<div class="table">
		
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>Title</th>
						<th>Genre</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach items="${list}" var="item">
						<tr>
							
							<td>${item.movie_id}</td>
							<td>${item.title}</td>
							<td>${item.genre}</td>
							<td><a href="view-fav?id=${item.movie_id}">
									<button type="button" class="delete" value="Delete item">
										Delete</button>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!--  
			<div>
				<p>Total no. of favorites=${total }</p>
			</div>
			-->
		</div>
	</div>

	<!-- Footer Section-->
	<div class="foot">

		<p>&copy; Copyright 2019</p>


	</div>


	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js">
		</body>
		</html>
	