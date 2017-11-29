function mostrarAlumnos(){
    var nombreUsuario = document.getElementById("nombreUsuario").value;
    var contraseña = document.getElementById("contraseña").value;
    if(nombreUsuario==="adriana" && contraseña==="vedel123"){
        location.assign("http://localhost:8080/FormularioInscripcion/mostrarDatos");
    }else{
        window.alert("Contraseña y/o nombre de usuario incorrecto");
    }
}

function borrarDiv(){
    var div = document.getElementById("final");
    div.innerHTML = "";
    div.style.width = "1285pt";
    div.style.borderTop = "solid .3rem #F39B53";
}

