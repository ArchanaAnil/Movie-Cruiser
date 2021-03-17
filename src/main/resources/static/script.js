
var oRows = document.getElementById('MyTable').getElementsByTagName('tr');
var iRowCount = oRows.length-1;
document.getElementById("result").innerHTML = "Number of Favorites : " + iRowCount;
// alert('Your table has ' + iRowCount + ' rows.');

function validateForm() {
    var x = document.forms["myForm"]["title"].value;
    if (x == "") {
        alert('Title is Mandatory!! ');
        // var x = document.getElementById("error").innerHTML=" Title is Mandatory!!";
        return false;
    }
    else if(x.length > 200 || x.length < 2)
    {
        alert('Title should be between 2 to 200 characters!! ');
       // var x = document.getElementById("error").innerHTML="Title should be between 2 to 200 characters!!";
        return false;
    }

    var y = document.forms["myForm"]["date"].value;
    if (y == "") {
        alert('Date is required!!');
       // var y = document.getElementById("error").innerHTML=" Date is required!!";
        return false;
    }

    var z = document.forms["myForm"]["gross"].value;
    if (z == "") {
        alert('Gross Collection is required!! ');
      //  var z = document.getElementById("error").innerHTML=" Gross Collection is required!!";
        return false;
    }
    if (isNaN(z)) 
    {
    alert("Gross Collection must be in numbers!");
    return false;
    }

    return true;
}