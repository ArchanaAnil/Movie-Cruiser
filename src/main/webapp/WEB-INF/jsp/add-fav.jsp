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
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="proj.js"></script>
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

	<h2>Movies</h2>
	<br>
	<br>
	<p id="messageAdded" style="color: green; text-align: center;">${message}</p>
	<div class="movie-table">
		<table>
			<thead>
				<tr>
					<th>Title</th>
					<th>Box Office</th>

					<th>Genre</th>
					<th>Has Teaser</th>
					<th>Action</th>
					<th>JQuery</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item">

					<tr>
						<th>${item.title}</th>
						<th>${item.box_office}</th>

						<th>${item.genre}</th>
						<th>${item.hasTeaser}</th>
						<th><a href="addToFav?id=${item.movie_id}">
								<button type="button" class="add" value="add">Add to
									Favorites</button>
						</a></th>
						<td><a class="btn btn-warning"
						onClick="addToFav'${item.movie_id}','${item.title}')">AddToFav</a></td>
						<td id="${item.movie_id}"></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>


	<div class="foot">

		<p>Copyright &copy; 2019</p>



	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

</body>
</html>