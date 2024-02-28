<template>
    <div class="form-group">
        <label for="estado">State:</label>
        <select class="form-control" id="estado">
            <option value="" selected="selected" disabled>--Seleccionado--</option>
            <option value="0">Inactivo</option>
            <option value="1">Activo</option>
        </select>
    </div>
</template>

<script>
export default {
    name: 'CmbEstado'
}
</script>

