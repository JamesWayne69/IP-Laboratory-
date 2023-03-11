function validate() {
    var flag = 1;
    if(document.forms["myform"]["p_name"].value == "" || document.forms["myform"]["c_no"].value == "" || document.forms["myform"]["email"].value == "" || document.forms["myform"]["dob"].value == "" || document.forms["myform"]["p_no"].value == "" || document.forms["myform"]["ad_no"].value == "") {
        flag = 0;
    }

    if(flag == 0) {
        alert("Check'yer data mate");
    }
    var name = /^[a-z ,.'-]+$/i;
    var num = /^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$/;
    var mail = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
    var dob = /^([0-3][1-9]|[1-3][0-9])-([0-1][1-9]|[1][0-9])-[0-9]{2}$/;
    var sex = /^(M|F|E)$/;
    var aad = /^[0-9]{12}$/;
    var pan = /^[0-9]{10}$/;


    if (!document.forms["myform"]["p_name"].value.match(name)) {
        alert('Check your name');
        flag = 0;
    }

    if (!document.forms["myform"]["ad_no"].value.match(aad)) {
        alert('Check your Identity');
        flag = 0;
    }

    if (!document.forms["myform"]["p_no"].value.match(pan)) {
        alert('Check your P Identity');
        flag = 0;
    }

    if (!document.forms["myform"]["c_no"].value.match(num)) {
        alert('Check your Contact Detes');
        flag = 0;
    }
    if (!document.forms["myform"]["email"].value.match(mail)) {
        alert('Check your Mail Choom');
        flag = 0;
    }
    if (!document.forms["myform"]["dob"].value.match(dob)) {
        alert('Check your BirthDate');
        flag = 0;
    }
    if (!document.forms["myform"]["sex"].value.match(sex)) {
        alert('Check your Orientation');
        flag = 0;
    }

    if(flag == 1) {
        window.open("success.html");
    }
    
    
}