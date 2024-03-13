import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';

import HomePage from '../views/HomePage.vue'
import ClientPage from '../views/ClientPage.vue'
import ProductPage from '../views/ProductoPage.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'Home', // Corregido: Nombre de la ruta debe ser 'Home'
    component: HomePage
  },
  {
    path: '/client',
    name: 'Client',
    component: ClientPage
  },
  {
    path: '/product',
    name: 'Product',
    component: ProductPage
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
