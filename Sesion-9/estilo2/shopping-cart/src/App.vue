<template>
  <ion-app>
    <ion-header>
      <ion-toolbar>
        <ion-title>Inicio</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content>
      <ion-list>
        <ion-item router-link="/" router-link-active>Acerca de</ion-item>
        <ion-item router-link="/client" router-link-active>Gestión Cliente</ion-item>
        <ion-item router-link="/product" router-link-active>Gestión Producto</ion-item>
      </ion-list>
      <ion-router-outlet />
    </ion-content>
  </ion-app>
</template>
<script setup lang="ts">
import { IonApp, IonRouterOutlet, IonHeader, IonToolbar, IonTitle, IonContent, IonList, IonItem } from '@ionic/vue';
</script>
