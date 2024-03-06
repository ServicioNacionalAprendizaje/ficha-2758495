<template>
    <div id="client">
        <div class="container">
            <!-- Parte 1: Card del título -->
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Gestión de clientes</h5>
                </div>
            </div>

            <!-- Parte 2: Campos de entrada de datos -->
            <form id="clienteForm">
                <input type="hidden" id="id">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre">
                </div>
                <div class="form-group">
                    <label for="apellido">Apellido:</label>
                    <input type="text" class="form-control" id="apellido">
                </div>
                <div class="form-group">
                    <label for="correo">Correo:</label>
                    <input type="email" class="form-control" id="correo">
                </div>
                <div class="form-group">
                    <label for="telefono">Teléfono:</label>
                    <input type="number" class="form-control" id="telefono">
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
            <table class="table" id="clienteTable">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Correo</th>
                        <th>Teléfono</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody id="data">

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
