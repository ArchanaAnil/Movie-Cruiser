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
<link rel="stylesheet" href="edit-movie-style.css">
<script src="script.js"></script>
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
				<a href="admin">Movies</a>
				 <a href="#">Logout</a>

			</div>

		</div>

	</header>

	<h2>Edit Movie</h2>

	<form class="edit-movie" name="myForm" action="edit"
		onsubmit="return validateForm()" method="POST">
		<table>
			<tr>
				<td><label for="id">Movie Id</label></td>
			</tr>
			<tr>
				<td class="id"><input type="number" id="id" name="id">
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td><label for="title">Title</label></td>
			</tr>
			<tr>
				<td class="title"><input type="text" id="title" name="title">
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td>Gross($)</td>
				<td>Genre</td>
			</tr>
			<tr>
				<td><input type="text" id="boxOffice" name="boxOffice"></td>
				<td><select id="genre" name="genre">
						<option id="genre" name="genre" value="Superhero">Superhero</option>
						<option id="genre" name="genre" value="Science Fiction">Science
							Fiction</option>
						<option id="genre" name="genre" value="Romance">Romance</option>
						<option id="genre" name="genre" value="Comedy">Comedy</option>
						<option id="genre" name="genre" value="Thriller">Thriller</option>
						<option id="genre" name="genre" value="Adventure">Adventure</option>
				</select></td>



		<!--  
				<br>
				<label for="category">Category</label>
				<select id="genre" name="genre">
					<option id="genre" name="genre" value="Superhero">Superhero</option>
					<option id="genre" name="genre" value="Science Fiction">Science
						Fiction</option>
					<option id="genre" name="genre" value="Romance">Romance</option>
					<option id="genre" name="genre" value="Comedy">Comedy</option>
					<option id="genre" name="genre" value="Thriller">Thriller</option>
					<option id="genre" name="genre" value="Adventure">Adventure</option>
				</select>
				<br>
		-->
				<table style="margin-top: 20px;">
					<tr>
						<td><input type="submit" value="Submit"></td>
					</tr>

				</table>

				</form>

				<!--
    <div>
        <p id="error" style="color: red; text-align: left;"></p>
    </div>
    -->

				<div class="foot">

					<p>Copyright &copy; 2019</p>



				</div>


				<script
					src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
					integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
					crossorigin="anonymous"></script>
</body>
</html>