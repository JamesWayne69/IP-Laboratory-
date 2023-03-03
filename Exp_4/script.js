function makesame() {
    document.getElementById("t2").innerHTML = document.getElementById("t1").innerHTML;
}

setInterval(makesame, 1000);