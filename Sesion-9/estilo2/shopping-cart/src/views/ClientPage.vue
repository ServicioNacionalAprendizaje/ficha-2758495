<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Gestión de clientes</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <!-- Parte 1: Card del título -->
      <ion-card>
        <ion-card-content>
          <ion-card-title>Gestión de clientes</ion-card-title>
        </ion-card-content>
      </ion-card>

      <!-- Parte 2: Campos de entrada de datos -->
      <ion-list>
        <ion-item>
          <ion-label position="floating">Nombre:</ion-label>
          <ion-input type="text" v-model="nombre"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="floating">Apellido:</ion-label>
          <ion-input type="text" v-model="apellido"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="floating">Correo:</ion-label>
          <ion-input type="email" v-model="correo"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="floating">Teléfono:</ion-label>
          <ion-input type="number" v-model="telefono"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label>Estado:</ion-label>
          <ion-select v-model="estado">
            <ion-select-option value="0">Inactivo</ion-select-option>
            <ion-select-option value="1">Activo</ion-select-option>
          </ion-select>
        </ion-item>
      </ion-list>

      <!-- Parte 3: Botón de Guardar -->
      <ion-button expand="block" @click="guardar()">Guardar</ion-button>
      <br>

      <!-- Parte 4: Datatable -->
      <ion-list>
        <ion-item v-for="(cliente, index) in clientes" :key="index">
          <ion-label>{{ cliente.nombre }}</ion-label>
          <ion-label>{{ cliente.apellido }}</ion-label>
          <ion-label>{{ cliente.correo }}</ion-label>
          <ion-label>{{ cliente.telefono }}</ion-label>
          <ion-label>{{ cliente.estado }}</ion-label>
          <ion-button @click="editarCliente(cliente)">Editar</ion-button>
          <ion-button @click="eliminarCliente(cliente)">Eliminar</ion-button>
        </ion-item>
      </ion-list>

      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <router-link to="/home" class="nav-link">Regresar</router-link>
          </li>
        </ul>
      </div>
    </ion-content>
  </ion-page>
</template>


<script setup lang="ts">
import { useRouter } from 'vue-router';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';

const irAInicio = () => {
  const router = useRouter();
  router.push({ name: 'Inicio' });
};

const irAClientes = () => {
  const router = useRouter();
  router.push({ name: 'Clientes' });
};

const irAProductos = () => {
  const router = useRouter();
  router.push({ name: 'Productos' });
};
</script>

<style scoped>
#container {
  text-align: center;
  
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
}

#container strong {
  font-size: 20px;
  line-height: 26px;
}

#container p {
  font-size: 16px;
  line-height: 22px;
  
  color: #8c8c8c;
  
  margin: 0;
}

#container a {
  text-decoration: none;
}
</style>
