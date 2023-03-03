function makesame() {
    document.getElementById("t2").value = document.getElementById("t1").value;
}

setInterval(makesame, 1000);

function run_code() {
    var x = document.getElementById("t1").value;
    document.getElementById("d1").innerHTML = x + "<br>";
}