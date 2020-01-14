/*Name this external file gallery.js*/

function upDate(previewPic) {

    document.getElementById('image').style.backgroundImage = "url(" + previewPic.src + ")";
    document.getElementById('image').innerHTML = previewPic.alt;
}

function unDo() {

    document.getElementById('image').style.backgroundImage = "url('')";
    document.getElementById('image').innerHTML = "Hover over an image below to display here.";
}

// function upDate(previewPic) {
//     const elem = document.getElementById("image");
//     elem.innerHTML = previewPic.getAttribute("alt");
//     elem.style.backgroundImage = `url(${previewPic.getAttribute("src")})`;
// }

// function unDo() {
//     const elem = document.getElementById("image");
//     elem.innerHTML = "Hover over an image below to display here.";
//     elem.style.backgroundImage = "url('')";
// }