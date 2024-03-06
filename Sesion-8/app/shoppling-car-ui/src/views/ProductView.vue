<template>
    <div id="product">
        <div class="container">
            <!-- Parte 1: Card del título -->
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Gestión de productos</h5>
                </div>
            </div>

            <!-- Parte 2: Campos de entrada de datos -->
            <form id="productoForm">
                <input type="hidden" id="id">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre">
                </div>
                <div class="form-group">
                    <label for="descripcion">Descripción:</label>
                    <input type="text" class="form-control" id="descripcion">
                </div>
                <div class="form-group">
                    <label for="precio">precio:</label>
                    <input type="number" class="form-control" id="precio">
                </div>
                <div class="form-group">
                    <label for="stock">Stock:</label>
                    <input type="number" class="form-control" id="stock">
                </div>
                <div class="form-group">
                    <label for="imagen">Stock:</label>
                    <input type="file" class="form-control" id="imagen">
                </div>
                <div class="form-group">
                    <label for="estado">Estado:</label>
                    <select class="form-control" id="estado">
                        <option value="" disabled>--Seleccionado--</option>
                        <option value="0">Inactivo</option>
                        <option value="1">Activo</option>
                    </select>
                </div>
            </form>

            <!-- Parte 3: Botón de Guardar -->
            <div id="botones">
                <button type="button" class="btn btn-primary" @click="guardar()">Guardar</button>
            </div>
            <br>

            <!-- Parte 4: Datatable -->
            <table class="table" id="productoTable">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Stock</th>
                        <th>Imágen</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody id="data">
                    <!-- Aquí se generarán dinámicamente las filas de la tabla -->
                </tbody>
            </table>
        </div>
    </div>
</template>
<script>
export default {
    methods: {
        guardar() {
            console.log('Guardado');
        }
    }
};
</script>
