- Pasos para convertir una página WEB a móvil con IONIC

1. Instalar Ionic y Cordova:
    * Asegúrate de tener Node.js instalado en tu sistema.
    * Instala Ionic y Cordova globalmente usando npm (Node Package Manager):
    
    `npm install -g @ionic/cli cordova`

2. Crear un nuevo proyecto Ionic:
    * Utiliza Ionic CLI para crear un nuevo proyecto:    
    
    `ionic start shopping-cart blank`

3. Elegir tipo de proyecto
    * Usar
    
    ```
    Angular | https://angular.io
    React   | https://reactjs.org
    Vue     | https://vuejs.org
    ```
    - Para este caso se eligio `vue`, para correr el servicio de la neuva app, ingresar a la raiz principal. 
    1. `cd shopping-cart`
    2. `npm install`
    3. `ionic start shopping-cart blank --type vue` 


4. Crear cuenta
    ```
    Create free Ionic account? (y/N) 
    ```

5. Portal de IONIC
    
    ```
    https://dashboard.ionicframework.com/
    ```

6. Agregar la plataforma móvil:
    - Navega hasta el directorio de tu proyecto recién creado.
    - Agrega la plataforma móvil que deseas construir (Android, iOS, etc.):
    
   `ionic cordova platform add android`

7. Copiar el contenido de tu página web:

    * Copiar el contenido de tu página web:
        - Copia los archivos HTML, CSS y JavaScript de tu página web al directorio del proyecto Ionic.
        - Asegúrate de ajustar el código si es necesario para que funcione correctamente en un entorno móvil.

    * Configurar enlaces y rutas:
        - Si tu página web utiliza rutas o enlaces internos, asegúrate de ajustarlos para que funcionen correctamente en el entorno de la aplicación móvil.

    * Optimizar para móviles:
        - Asegúrate de que tu diseño y contenido estén optimizados para dispositivos móviles, teniendo en cuenta el tamaño de la pantalla y la interacción táctil.

    * Pruebas y depuración:
        - Ejecuta tu aplicación en un simulador o dispositivo real para realizar pruebas.
        - Utiliza herramientas de depuración para solucionar cualquier problema que encuentres.

    * Despliegue:
        - Una vez que estés satisfecho con tu aplicación, estás listo para implementarla en las tiendas de aplicaciones correspondientes (Google Play Store, Apple App Store, etc.).