/*var xmlhttp = new XMLHttpRequest();
var url = "data.txt";

xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
        var myArr = JSON.parse(this.responseText);
        myFunction(myArr);
    }
};
xmlhttp.open("GET", url, true);
xmlhttp.send();

function myfunction(arr) {
    var out = "";
    for (var i = 0; i < arr.length; i++) {
        out += "<h1>" + arr[i].age + "h1";
    }
    document.writeln(out);
} */