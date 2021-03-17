<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <script src="login-validate.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='https://fonts.googleapis.com/css?family=Amita' rel='stylesheet'>
<link rel="stylesheet" href="signup-style.css">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="proj.js"></script>
 
<body>

    <!-- Header section -->
    <header>
        <div class="header">
            <a href="homepage" class="logo">Movie Cruiser</a>
            <div class="header-right">
              <a href="homepage">Homepage</a>
             
             
            </div>
         
        </div>
        
    </header>
<!-- Header section ends here -->

    <h2 style="text-align: center;">Login </h2>
    <!--Step 1:Adding HTML-->
    <form name="myForm" action="admin" onsubmit="return validateForm()" method="post" >
        <div class="signup-container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" id="usernames" >
            <p id="error" style="color: red; "></p>
            <h5 id="usercheck" style="color: red;" > 
                    **Username is missing 
              </h5> 
            
            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="pass" id="password" >
            <p id="psw-error" style="color: red; "></p>
            <h5 id="passcheck" style="color: red;"> 
                **Please Fill the password 
              </h5> 
            
            
 
            <div class="clearfix">
                
               <input type="submit" id="submitbtn" 
             value="Submit" class="btn btn-primary">    
                <p id="credentials-error" style="color: red; "></p>
            </div>
            <p>New here? <a href="signup">Sign up Now!</a></p>
        </div>
    </form>

    <!-- Footer Section-->
    <div class="foot">
        
        <p>
            &copy; Copyright 2019
        </p>
      
        
      </div>
 
</body>
 
</html>
