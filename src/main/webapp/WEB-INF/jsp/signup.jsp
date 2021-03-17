<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="signup-validate.js"></script>
<link rel="stylesheet" href="signup-style.css">
<link href='https://fonts.googleapis.com/css?family=Amita' rel='stylesheet'>
 
<body>

    <!-- Header section -->
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

    <h2 style="text-align: center;">Signup </h2>
    <!--Step 1:Adding HTML-->
    <form name="myForm" action="customer" onsubmit="return validateForm()" method="post" >
        <div class="signup-container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" id="username" >
            <p id="error" style="color: red; "></p>

            <label><b>First Name</b></label>
            <input type="text" placeholder="Enter First Name" name="firstname" id="firstname">
            <p id="name-error" style="color: red; "></p>

            <label><b>Last name</b></label>
            <input type="text" placeholder="Enter Last name" name="lastname" id="lastname">
 
            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" id="psw">
            <p id="psw-error" style="color: red; "></p>

            <label><b>Confirm Password</b></label>
            <input type="password" placeholder="Confirm Password" name="psw-repeat" id="psw-repeat">
            <p id="re-error" style="color: red; "></p>
 
            <div class="clearfix">
                
                <button type="submit" class="signupbtn">Sign Up</button>
            </div>
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
