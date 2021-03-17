<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie Cruiser</title>
    <link href='https://fonts.googleapis.com/css?family=Amita' rel='stylesheet'>
    <link rel="stylesheet" href="movie-list-admin-style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
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

    <h2>Movies</h2>

    <div class="movie-table">
        <table>
        <thead>
            <tr>
              <th>Title</th>
              <th>Box Office</th>
              <th>Active</th>
              <th>Date of Launch</th>
              <th>Genre</th>
              <th>Has Teaser</th>
              <th>Action</th>
            </tr>
            </thead>
           <tbody>
			<c:forEach items="${list}" var="item">

				<tr>
					<th>${item.title}</th>
					<th>${item.box_office}</th>
					<th>${item.active}</th>
					<th>${item.dateOfLaunch}</th>
					<th>${item.genre}</th>
					<th>${item.hasTeaser}</th>
					<th><a href="edit?id=${item.movie_id}">
                <button type="button" class="edit" value="edit">Edit
        		</button></a>
					</th>
				</tr>
			</c:forEach>
		</tbody>

	</table>
    </div>


    <div class="foot">
        
        <p>
             Copyright &copy; 2019
        </p>
       

        
    </div>   
   
  
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

</body>
</html>