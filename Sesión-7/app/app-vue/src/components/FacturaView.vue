<template>
    <div class="container-fluid">
        <!-- Parte 1: Card del título -->
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Gestión de {{msg}}</h5>
            </div>
        </div>

        <!-- Parte 2: Campos de entrada de datos -->
        <form id="FacturaForm">
            <input type="hidden" id="id">
            <div class="form-group">
                <label for="fecha">Fecha:</label>
                <input type="date" class="form-control" id="fecha">
            </div>
            <div class="form-group">
                <label for="totalPagar">Total Pagar:</label>
                <input type="text" class="form-control" id="totalPagar">
            </div>
            <div class="form-group">
                <label for="cliente">Cliente:</label>
                <select class="form-control" id="clienteId">                    
                    <!-- Datos llegan de la base de datos -->
                </select>
            </div>

            <CmbEstado></CmbEstado>
        </form>

        <!-- Parte 3: Botón de Guardar -->
        <div class="text-center">
            <button type="button" class="btn btn-primary" onclick="Save()">Guardar</button>
        </div>

        <!-- Parte 4: Datatable -->
        <div class="table-responsive">
            <table class="table" id="FacturaTable">
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Total Pagar</th>
                        <th>Cliente</th>
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
import CmbEstado from './CmbEstado.vue'

export default {
  name: 'FacturaView',
  props: {
    msg: String
  },
    components: {
        CmbEstado
    }
}
</script>

