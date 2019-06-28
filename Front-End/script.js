$(document).ready(function() {
    console.log('run')
});

$('#iniciar_sesion').click(function() {
	$.ajax({
       
        type: 'POST',
        dataType: 'JSON', 
        contentType: "application/json; charset=utf-8",
        url: 'http://localhost:8080/usuario/sesion',
        data: JSON.stringify({ 
            "correo": $('#correo').val(),
            "contraseña" : $('#contraseña').val() 
        }),
        success: function(res) {
            if(res){
                Swal.fire(
                    'Exito',
                    'Inicio de Sesión Exitoso',
                    'success'
                )            
            }
            else{
                Swal.fire(
                    'Error',
                    'Correo no registrado o contraseña incorrecta',
                    'error'
                ) 
            }
        }
    });

});

$('#registrar').click(function() {
	$.ajax({
       
        type: 'POST',
        dataType: 'JSON', 
        contentType: "application/json; charset=utf-8",
        url: 'http://localhost:8080/usuario/crear',
        data: JSON.stringify({ 
            "correo": $('#correo').val(),
            "contraseña" : $('#contraseña').val() 
        }),
        success: function(res) {
            if(res){
                Swal.fire(
                    'Exito',
                    'Registro Exitoso',
                    'success'
                )            
            }
            else{
                Swal.fire(
                    'Error',
                    'Error en Registro, intente con otro correo',
                    'error'
                ) 
            }
        }
    });

});