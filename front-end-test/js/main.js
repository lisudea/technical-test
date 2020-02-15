'use strict'

var user = document.getElementById("user");
var pass = document.getElementById("pass");

var button1 = document.getElementById("registrar");


button1.addEventListener("click",function(){
    if(user.value == pass.value){
        alert("Yaga esta prueba \nMóntate que nos vamos");
    }
    else {
        alert("Pailas papi, yaper");
    }
})
