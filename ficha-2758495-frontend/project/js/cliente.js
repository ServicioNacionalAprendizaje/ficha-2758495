function All() {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Itera sobre los datos obtenidos
            var html = ``;
            $.each(data, function (index, cliente) {
                html += `<tr>
                <th>`+ cliente.nombre + `</th>
                <th>`+ cliente.apellido + `</th>
                <th>`+ cliente.correo + `</th>
                <th>`+ cliente.telefono + `</th>
                <th>`+ (cliente.estado == true ? 'Activo':'Inactivo') + `</th>
                <th>Editar </th>
                <th><input type="button" class="btn btn-primary" value="Editar" onclick="FindById(`+ cliente.id + `)"></th>
                <th><input type="button" class="btn btn-primary" value="Eliminar" onclick="Delete(`+ cliente.id + `)"></th></tr>`;
            });

            // Agrega el HTML al contenedor        
            $('#data').html(html);
            CleanData();
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}

function FindById(id) {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente/' + id,
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $('#id').val(data.id);
            $('#nombre').val(data.nombre);
            $('#apellido').val(data.apellido);
            $('#correo').val(data.correo);
            $('#telefono').val(data.telefono);
            $('#estado').val((data.estado == true ? 1 : 0));

             // Cambiar el evento onclick y el valor del botón
             $("#botones input").attr("onclick", "Update()").val("Actualizar");
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}

function Delete(id) {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente/' + id,
        type: 'DELETE',
        success: function (data) {
            alert('Cliente eliminado');
            //SweeAlert
            All();
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}

function Save() {
    parametros = {
        "nombre": $('#nombre').val(),
        "apellido": $('#apellido').val(),
        "correo": $('#correo').val(),
        "telefono": $('#telefono').val(),
        "estado": parseInt($('#estado').val())
    };
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente',
        method: 'POST',  // Cambia a 'PUT' si es una actualización
        contentType: 'application/json',
        data: JSON.stringify(parametros),
        success: function (response) {
            alert('Datos guardados exitosamente:', response);
            All();
        },
        error: function (xhr, status, error) {
            console.error('Error al guardar los datos de la API:', error);
        }
    });
}

function Update() {
    parametros = {
        "nombre": $('#nombre').val(),
        "apellido": $('#apellido').val(),
        "correo": $('#correo').val(),
        "telefono": $('#telefono').val(),
        "estado": parseInt($('#estado').val())
    };
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente/'+$('#id').val(),
        method: 'PUT', 
        contentType: 'application/json',
        data: JSON.stringify(parametros),
        success: function (response) {
            alert('Datos modificados exitosamente:', response);
            All();
        },
        error: function (xhr, status, error) {
            console.error('Error al guardar los datos de la API:', error);
        }
    });
}

function CleanData() {
    $('#id').val('');
    $('#nombre').val('');
    $('#apellido').val('');
    $('#correo').val('');
    $('#telefono').val('');
    $('#estado').val('');
    $("#botones input").attr("onclick", "Save()").val("Guardar");
}



