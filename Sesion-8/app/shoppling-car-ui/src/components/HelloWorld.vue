<template>
  <div class="home">
    <div class="alert alert-info" role="alert">
      Esta es una aplicación de carrito de compras. ¡Explora nuestra amplia selección de productos y encuentra lo que necesitas!
    </div>
    <h1>Bienvenido a nuestra tienda en línea</h1>
    <p>¡Gracias por visitarnos! En nuestra tienda, encontrarás una variedad de productos para satisfacer tus necesidades.</p>
    <div class="product-list">
      <!-- Aquí puedes agregar la lista de productos -->
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld'
}
</script>

<!-- Estilos CSS para este componente -->
<style scoped>
.home {
  text-align: center;
  padding: 20px;
}

.alert {
  margin-bottom: 20px;
}

.product-list {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
  gap: 20px;
  margin-top: 20px;
}

.product {
  border: 1px solid #ccc;
  padding: 10px;
  border-radius: 5px;
  background-color: #f9f9f9;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.product img {
  max-width: 100%;
  height: auto;
}

.product h3 {
  margin-top: 10px;
}

.product p {
  margin-top: 5px;
  font-size: 14px;
}
</style>