function billingFunction() {

    if (document.getElementById('same').checked) {
        document.getElementById('billingName').value = document.getElementById('shippingName').value;
        document.getElementById('billingZip').value = document.getElementById('shippingZip').value;
    } else {
        document.getElementById('billingName').value = "";
        document.getElementById('billingZip').value = "";
    }
}

function billingFunction() {
    var x = document.getElementById("shippingName").value;
    var y = document.getElementById("shippingZip").value;
    var checkBox = document.getElementById("same");
    if (checkBox.checked == true) {
        document.getElementById("billingName").value = x;
        document.getElementById("billingZip").value = y;
    } else {
        document.getElementById("billingName").value = "";
        document.getElementById("billingZip").value = "";
    }
}