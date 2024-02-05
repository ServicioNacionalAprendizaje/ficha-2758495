# ficha-2758495-backend
ficha-2758495-backend

# Tener en cuenta
Backend:
	node
	java => spring boot
	c#
	php
	

Frontend
	java script 
	html(no es lenguaje de programación)
	css(no es lenguaje de programación)
	js=>angular
	js=>vue
	js=> aionic(móviles)*****
	
	
# Importante:
- java => spring boot (backend)
- js=> aionic(móviles) (frontend)

# Git para revisa
- git=> github : https://github.com/ariel5253


# Planteamiento
``

Cliente [nombre, apellido, correo, telefono]
Producto [nombre, descripcion, precio, stock]
Factura [fecha, clienteId, totalFactura]
DetalleFactura [productoId, cantidad, valorPagar]


Para plantear el modelo de relaciones entre las entidades Cliente, Producto, Factura y DetalleFactura, podemos utilizar un diagrama entidad-relación (DER) o describir las relaciones textualmente. Aquí está la descripción textual del modelo:

Cliente:

Atributos:
nombre (cadena de caracteres)
apellido (cadena de caracteres)
correo (cadena de caracteres)
telefono (cadena de caracteres)
Producto:

Atributos:
nombre (cadena de caracteres)
descripcion (cadena de caracteres)
precio (decimal)
stock (entero)
Factura:

Atributos:
fecha (fecha)
clienteId (clave foránea que referencia al Cliente)
totalFactura (decimal)
DetalleFactura:

Atributos:
productoId (clave foránea que referencia al Producto)
cantidad (entero)
valorPagar (decimal)
Relaciones:

Un cliente puede tener ninguna o varias facturas asociadas (relación uno a muchos entre Cliente y Factura).
Una factura pertenece a un único cliente (relación muchos a uno entre Factura y Cliente).
Una factura puede contener uno o varios detalles de factura (relación uno a muchos entre Factura y DetalleFactura).
Un detalle de factura pertenece a una única factura (relación muchos a uno entre DetalleFactura y Factura).
Un detalle de factura está asociado a un único producto (relación muchos a uno entre DetalleFactura y Producto).
Un producto puede estar presente en ninguno, uno o varios detalles de factura (relación uno a muchos entre Producto y DetalleFactura).
Este modelo de relaciones representa una estructura básica para un sistema de gestión de ventas o facturación.


+--------------+           +--------------+
|    Cliente   |           |   Producto   |
+--------------+           +--------------+
| clienteId PK | <-------> | productoId PK|
| nombre       |           | nombre       |
| apellido     |           | descripcion  |
| correo       |           | precio       |
| telefono     |           | stock        |
+--------------+           +--------------+
       |                           |
       |                           |
       |                           |
       v                           v
+--------------+           +--------------+
|   Factura    |           | DetalleFactura|
+--------------+           +--------------+
| facturaId PK | <-------> | facturaId FK |
| fecha        |           | productoId FK|
| clienteId FK |           | cantidad     |
| totalFactura |           | valorPagar   |
+--------------+           +--------------+

``

# Enlace de repositorio de la ficha
- https://github.com/ServicioNacionalAprendizaje/ficha-2758495-backend.git
- https://github.com/ServicioNacionalAprendizaje/ficha-2758495-frontend.git


# Comandos a tener en cuenta
``
git pull //Obtener cambios del repositorio
git add -A //Agragar todos los cambios del repositorio local
git commit -m "Mensaje que aclara que va a publicar" //Se informa que cambios se van a publicar en el repositorio
git push //Lanzar cambios al repositorio
``