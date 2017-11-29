$(document).ready(function(){

    $('ul.tabs li a:first').addClass('active');
    $('.secciones article').hide();
    $('.secciones article:first').show();
    $('ul.tabs li a').click(
    function(){
    $('ul.tabs li a').removeClass('active');
    $(this).addClass('active');
    $('.secciones article').hide();
    var  activeTab = $(this).attr('href');
    $(activeTab).show();
    return false;
    });
});


function validacion() {
    
    carrera = $("input[name='carrera']:checked").val();
    
    sexo = $("input[name='sexo']:checked").val();
    obrasocial = $("input[name='obra']:checked").val();
    becado = $("input[name='becado']:checked").val();
    seguro = $("input[name='seguro']:checked").val();
    jurisdiccion = $("input[name='jurisdiccion']:checked").val();
    padrevive = $("input[name='padrevive']:checked").val();
    padretrabaja = $("input[name='padretrabaja']:checked").val();
    madrevive  = $("input[name='madre']:checked").val();
    madretrabaja  = $("input[name='madretrabaja']:checked").val();
    tipodoc = $("input[name='tipo']:checked").val();
    
    apellido = document.getElementById("apellidos").value;
    nombre = document.getElementById("nombres").value;
    numdni = document.getElementById("numdni").value;
    provincia = document.getElementById("provincia").value;
    departamento = document.getElementById("departamento").value;
    nacionalidad = document.getElementById("nacionalidad").value;
    nacimiento = document.getElementById("nacimiento").value;
    establecimiento = document.getElementById("establecimiento").value;
    egreso = document.getElementById("egreso").value;
    establecimientosecundario = document.getElementById("establecimientosecundario").value;
    titulosecundario = document.getElementById("titulosecundario").value;
    egresosecundario = document.getElementById("egresosecundario").value;
   
    
    
    if(carrera == null){
        alert("Por favor seleccione a la carrera que desea inscribirse!  - Pagina Inicio");
        return false;
    }else if (apellido == null || apellido.length == 0 || /^\s+$/.test(apellido)){
       // Si no se cumple la condicion...
        alert('El campo Apellido esta vacio - Pagina 1');
        return false;
    }else if (nombre == null || nombre.length == 0 || /^\s+$/.test(nombre)) {
        // Si no se cumple la condicion...
        alert('El campo Nombre esta vacio - Pagina 1');
        return false;
    }else if(tipodoc == null){
        alert("(C.O) : Elija opcion de tipo de documento - Pagina 1");
        return false;
        
    }else if ( numdni== null || numdni.length == 0 || /^\s+$/.test(numdni)) {
        // Si no se cumple la condicion...
        alert('[El campo Numero DNI esta vacio - Pagina 1');
        return false;
    }else if ( provincia== null || provincia.length == 0 || /^\s+$/.test(provincia)) {
        // Si no se cumple la condicion...
        alert('El campo Provincia esta vacio - Pagina 1');
        return false;
    }else if ( departamento== null || departamento.length == 0 || /^\s+$/.test(departamento)) {
        // Si no se cumple la condicion...
        alert('El campo Departamento esta vacio - Pagina 1');
        return false;
    }else if ( nacionalidad== null || nacionalidad.length == 0 || /^\s+$/.test(nacionalidad)) {
        // Si no se cumple la condicion...
        alert('El campo Nacionalidad esta vacio - Pagina 1');
        return false;
    }else if ( nacimiento== null || nacimiento.length == 0 || /^\s+$/.test(nacimiento)) {
        // Si no se cumple la condicion...
        alert('El campo Nacimiento esta vacio - Pagina 1');
        return false;
    }else if (sexo == null) {
        alert("(C.O) : Elija opcion de Sexo - Pagina 1");
        return false;
    }else if(obrasocial == null){
        alert("(C.O) : Elija opcion de Obra Social - Pagina 1");
        return false;
    }else if(becado == null){
        alert("(C.O) : Elija opcion de Esta Becado - Pagina 1");
        return false;
    }else if(seguro == null){
        alert("(C.O) : Elija opcion de Seguro de Vida - Pagina 1 ");
        return false;
        
    }else if(padrevive == null){
        alert("(C.O) : Elija opcion de Padre Vive - Pagina 3 ");
        return false;
    }else if(padretrabaja == null){
        alert("(C.O) : Elija opcion de Padre Trabaja - Pagina 3 ");
        return false;
    }else if(madrevive == null){
        alert("(C.O) : Elija opcion de Madre Vive - Pagina 3 ");
        return false;
    }else if(madretrabaja == null){
        alert("(C.O) : Elija opcion de Madre Trabaja - Pagina 3 ");
        return false;
    }
        
    
    
        
        
    
    
    
    
    
    // Si el script ha llegado a este punto, todas las condiciones
    // se han cumplido, por lo que se devuelve el valor true
    return true;
    
    
    
    
}