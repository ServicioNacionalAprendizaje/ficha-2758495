import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import 'bootstrap/dist/js/bootstrap.bundle.min.js'; // Importa Bootstrap con la ruta completa
import '@popperjs/core/dist/umd/popper.min.js'; // Importa popper.js con la ruta completa

import 'bootstrap/dist/css/bootstrap.min.css'; // Importa los estilos de Bootstrap con la ruta completa

createApp(App).use(router).mount('#app');
