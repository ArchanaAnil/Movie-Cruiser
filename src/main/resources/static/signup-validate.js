function validateForm() {
    var x = document.forms["myForm"]["username"].value;
    if (x == "") {
        var x = document.getElementById("error").innerHTML=" Username is required!!";
        return false;
    }
    
    var a = document.forms["myForm"]["firstname"].value;
    if (a == "") {
        var a = document.getElementById("name-error").innerHTML=" First name is required!!";
        return false;
    }

    var y = document.forms["myForm"]["psw"].value;
    if (y == "") {
        var y = document.getElementById("psw-error").innerHTML=" Password is required!!";
        return false;
    }

    
    var z = document.forms["myForm"]["psw-repeat"].value;
    if (y != z) {
        var z = document.getElementById("re-error").innerHTML=" Password does not match!!";
        return false;
    }

   
    return true;
}