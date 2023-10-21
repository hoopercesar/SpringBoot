// Call the dataTables jQuery plugin
$(document).ready(function() {

    cargarUsuarios();


  $('#usuarios').DataTable();
});

async function cargarUsuarios() {

    const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
    });

    const usuarios = await request.json();
    let listadoHtml=``;

    for (let user of usuarios){

        let tabla = `
            <tr>
                <td>${user.id}</td>
                <td>${user.nombre} ${user.apellido}</td>
                <td>${user.email}</td>
                <td>${user.telefono}</td>
                <td>
                    <a href="#" class="btn btn-danger btn-circle btn-sm">
                        <i class="fas fa-trash"></i>
                    </a>
                </td>
            </tr>
        `;

        listadoHtml += tabla;

    }

    // '''''

    document.querySelector("#usuarios tbody").outerHTML = listadoHtml;

}
