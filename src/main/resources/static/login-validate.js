function validateForm() {
    var x = document.forms["myForm"]["username"].value;
    if (x == "") {
        var x = document.getElementById("error").innerHTML=" Username is required!!";
        return false;
    }
    
    var y = document.forms["myForm"]["password"].value;
    if (y == "") {
        var y = document.getElementById("psw-error").innerHTML=" Password is required!!";
        return false;
    }

	if (x == "admin" && y == "root") {
	
  		return true;
     }
  else 
  {
  document.getElementById("credentials-error").innerHTML=" Wrong credentials!!";
    return false;
  }
   
    return true;
}