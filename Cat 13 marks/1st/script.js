function makesame() {
    document.getElementById("t2").value = document.getElementById("t1").value;
}

setInterval(makesame, 1000);