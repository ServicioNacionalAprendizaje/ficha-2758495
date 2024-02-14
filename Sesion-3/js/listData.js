function ListCliente() {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Cliente',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Itera sobre los datos obtenidos
            var listData = ``;
            $.each(data, function (index, cliente) {
                listData += `<option value="` + cliente.id + `">` + cliente.nombre + ` `+cliente.apellido+`</option>`;
            });

            // Agrega el HTML al contenedor        
            $('#clienteId').html(listData);
            CleanData();
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}

function ListProducto() {
    $.ajax({
        url: 'http://localhost:9000/movil/api/Producto',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Itera sobre los datos obtenidos
            var listData = ``;
            $.each(data, function (index, producto) {
                listData += `<option value="` + producto.id + `">` + producto.nombre + ` `+producto.precio+`</option>`;
            });

            // Agrega el HTML al contenedor        
            $('#clienteId').html(listData);
            CleanData();
        },
        error: function (xhr, status, error) {
            console.error('Error al obtener los datos de la API:', error);
        }
    });
}