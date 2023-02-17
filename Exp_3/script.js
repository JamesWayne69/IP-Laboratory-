function validate() {
    var flag = 1;
    if(document.forms["myform"]["pname"].value == "" && document.forms["myform"]["c_no"].value == "" && document.forms["myform"]["c_name"].value == "" && document.forms["myform"]["g_origin"].value == "" && document.forms["myform"]["age"].value == "" && document.forms["myform"]["sex"].value == "" && document.forms["myform"]["doa"].value == "" && document.forms["myform"]["studio"].value == "" && document.forms["myform"]["pub"].value == "" && document.forms["myform"]["desc"].value == "") {
        flag = 0;
    }
    alert("you filled the list");

    if(flag == 0) {
        alert("Check'yer data mate");
    }
    
}