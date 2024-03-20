# Base de datos 
1. Montar la base de datos

```sql
    DROP DATABASE IF EXISTS movil_2758495 ; 
    CREATE DATABASE movil_2758495;
```

# Backend

2. Correr backend - Verificar datos de conexión. Se debe ajustar de acuerdo con el PC dónde se vaya a correr

```java
    server.servlet.context-path=/movil
    server.port= 9000
    spring.jpa.hibernate.ddl-auto = update
    spring.jpa.show-sql=true
    spring.datasource.url = jdbc:mysql://localhost:3306/movil_2758495
    spring.datasource.username = root
    spring.datasource.password = abcd
```

3. Ruta de acceso a la API
```http
    http://localhost:9000/movil/swagger-ui/index.html#/
```

# Frontend

1. Acceder a la carpeta raín del proyecto

```js
    ionic serve
```

# Despliegue

1. Instalar
npm install @capacitor/android

2. Instalación de android en ionic
npx cap add android

3. Compilador 
ionic build

4. Verificador del capacitor
npx cap ls

5. Copiamos el proyecto
npx cap copy android

6. Abrimos el proyecto en Android Studio
npx cap open android

