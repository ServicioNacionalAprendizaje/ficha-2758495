<template>
    <div class="container-fluid">
        <!-- Parte 1: Card del título -->
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Gestión de {{msg}}</h5>
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
            
            <CmbEstado></CmbEstado>
        
        </form>
    </div>
  
</template>


<script>

import CmbEstado from './CmbEstado.vue'

export default {
  name: 'ClienteView',
  props: {
    msg: String
  },
  components: {
    CmbEstado
  }
}
</script>



