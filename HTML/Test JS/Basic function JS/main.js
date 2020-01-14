function Hello() {
    var person = prompt("Enter you name?", "Sei Silver");
    if (person != null) {
        return "Hello " + person + "\n Welcome to JS!\n";
    }
}


function myFunction(p1, p2) {
    // return p1 * p2;
    document.getElementById("demo").innerHTML = p1 * p2;
}

function swit() {
    var text;
    var key = prompt("Enter key ?", "Sei Silver");
    switch (key) {
        case "Sei Silver":
            text = "Correct!";
            alert(text);
            break;
        default:
            text = "Error!";
            alert(text);
            break;
    }
}