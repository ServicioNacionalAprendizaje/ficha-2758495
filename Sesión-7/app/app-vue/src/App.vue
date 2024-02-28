<template>
  <ClienteView msg="Cliente"/>
  <FacturaView msg="Factura"/>
</template>

<script>

import ClienteView from './components/ClienteView.vue'
import FacturaView from './components/FacturaView.vue'

export default {
  name: 'App',
  components: {
    ClienteView,
    FacturaView
  }
}
</script>
