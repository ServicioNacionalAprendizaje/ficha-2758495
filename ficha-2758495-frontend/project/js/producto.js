function All() {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Producto',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Itera sobre los datos obtenidos
            var html = ``;
            $.each(data, function (index, producto) {
                html += `<tr>
                <th>`+ producto.nombre + `</th>
                <th>`+ producto.descripcion + `</th>
                <th>`+ producto.precio + `</th>
                <th>`+ producto.stock + `</th>
                <th> <img src="data:image/jpeg;base64,`+ producto.imagen + `" height="35%" /></th>
                <th>`+ (producto.estado == true ? 'Activo':'Inactivo') + `</th>
                <th>Editar </th>
                <th><input type="button" class="btn btn-primary" value="Editar" onclick="FindById(`+ producto.id + `)"></th>
                <th><input type="button" class="btn btn-primary" value="Eliminar" onclick="Delete(`+ producto.id + `)"></th></tr>`;
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
        url: 'http://localhost:9000/movil/api/Producto/' + id,
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $('#id').val(data.id);
            $('#nombre').val(data.nombre);
            $('#descripcion').val(data.descripcion);
            $('#precio').val(data.precio);
            $('#stock').val(data.stock);
            // $('#imagen').val(data.imagen);
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
        url: 'http://localhost:9000/movil/api/Producto/' + id,
        type: 'DELETE',
        success: function (data) {
            alert('Producto eliminado');
            //SweeAlert
            All();
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}

function Save() {
    var fileInput = document.getElementById('imagen');
    var file = fileInput.files[0];
    var reader = new FileReader();

    reader.onload = function(event) {
        var base64imagen = event.target.result.split(',')[1]; // Obtiene la parte de datos Base64
        
        var parametros = {
            "nombre": $('#nombre').val(),
            "descripcion": $('#descripcion').val(),
            "precio": parseFloat($('#precio').val()),
            "stock": parseInt($('#stock').val()),
            "imagen": base64imagen,
            "estado": parseInt($('#estado').val())
        };
        
        $.ajax({
            url: 'http://localhost:9000/movil/api/Producto',
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
    };

    // Lee el archivo como una cadena Base64
    reader.readAsDataURL(file);
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
        url: 'http://localhost:9000/movil/api/Producto/'+$('#id').val(),
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



