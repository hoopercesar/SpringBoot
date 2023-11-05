// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready

});

async function iniciarSesion() {
    let datos = {};

    datos.email = document.getElementById('txtemail').value;
    datos.password = document.getElementById('txtpassword').value;


    const request = await fetch('api/login', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const usuarios = await request.text();
    if (usuarios == "OK") {
        window.location.href = 'usuarios.html';
    } else {
        alert("Las credenciales son incorrectas");
    }




    // '''''



}