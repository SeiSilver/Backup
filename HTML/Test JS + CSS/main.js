function textchange() {
    document.getElementById("datachange").innerHTML = "Data have been changed!";
}

function undo() {
    document.getElementById("datachange").innerHTML = "test";

}

function hello() {

    var person = prompt("Enter you name: ", "Name");
    if (person === null || person == "Name") {
        alert("Wrong input !");
        return false;
    } else document.getElementById("demo").innerHTML = "Hello " + person + " Welcome to javascript!";

}

function zoom(source) {
    source.style.width = "20%";
    document.body.style.backgroundImage = "url(" + source.src + ")";
}

function undozoom(source) {
    source.style.width = "10%";
    document.body.style.backgroundImage = "url('')";
}

function xy() {
    var x = "FPT";
    var y = "Limited";
    var z = x + y;
    document.getElementById("xy").innerHTML = z;

}

function myFunction() {
    var x = document.getElementById("numb").value;
    var text;
    if (isNaN(x) || x < 1 || x > 10) {
        text = "Input not valid";
    } else {
        text = "Input OK";
    }
    document.getElementById("number").innerHTML = text;
}

function radio() {
    var res;
    if (document.getElementById('en').checked) {
        res = document.getElementById("en").value;
    } else if (document.getElementById('vn').checked) {
        res = document.getElementById("vn").value;
    }
    document.getElementById("radiodata").innerHTML = res;

}