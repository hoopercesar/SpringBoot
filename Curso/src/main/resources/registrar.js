// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready

});

async function registrarUsuario() {
    let datos = {};
    datos.nombre = document.getElementById('txtnombre').value;
    datos.apellido = document.getElementById('txtapellido').value;
    datos.email = document.getElementById('txtemail').value;
    datos.telefono = '1234568769'
    datos.password = document.getElementById('txtpassword').value;

    let password2 = document.getElementById('txtrepetirpassword').value;

    if (password2 != datos.password){
        alert('Las contraseñas no coinciden!')
        return;
    }

    const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const usuarios = await request.json();
    let listadoHtml=``;

    // '''''



}

