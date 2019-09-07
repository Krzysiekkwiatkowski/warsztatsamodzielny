document.addEventListener("DOMContentLoaded", function () {
    var element = document.getElementById("content");
    document.getElementById("2").addEventListener("click", function () {
        element.removeAttribute("hidden");
    });
    document.getElementById("1").addEventListener("click", function () {
        element.setAttribute("hidden","");
    });
});