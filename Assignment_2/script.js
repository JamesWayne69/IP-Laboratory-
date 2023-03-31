function validate() {
    var flag = 1;
    if(document.forms["myform"]["pwd"].value == "" || document.forms["myform"]["email"].value == "" ) {
        flag = 0;
    }

    if(flag == 0) {
        alert("Check'yer data mate");
    }
    var name = /^[a-zA-Z0-9][a-zA-Z0-9_@.-]+$/i;
    var pwd  = /^[a-zA-Z0-9_@.-]{6,14}$/



    if (!document.forms["myform"]["pwd"].value.match(pwd)) {
        alert('Check Password');
        flag = 0;
    }
    if (!document.forms["myform"]["email"].value.match(name)) {
        alert('Check Username');
        flag = 0;
    }

    if(flag == 1) {
        window.open("./db");
    }
    
    
}