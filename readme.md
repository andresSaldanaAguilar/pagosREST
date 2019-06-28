# Inicio de sesion REST 

Este proyecto es un ejemplo de funcionamiento de un servicio resst, donde por medio de peticiones asincronas AJAX con la ayuda de JQuery se envia informacion en formato JSON que posteriormente Spring es capaz de convertir en objetos java que representan las entidades de su base de datos.

### Instalación
1.-Cargar script 'script.sql' en base de datos (MySQL).

2.-Para iniciar el servidor java REST:

Instalar eclipse IDE y bajar Spring tools del marketplace, una vez instalado, importar el projecto, hacer maven clean, maven install y finalmente spring run.

3.-Para hacer uso del frontend, abrir un navegador web para abrir el documento index.html, donde se puede agregar un nuevo usuario o iniciar sesión.

## Pruebas

Puedes hacer pruebas una ves corriendo el servidor con el uso de esta coleccion de Postman, donde se envian los datos en formato JSON en el cuerpo de la peticion POST y se convierten en objetos java:

https://www.getpostman.com/collections/8214102394d66d3c79cf


Interfaz de usuario para inicio de sesion o registro
![alt text](/Pruebas/registro_usuario_nuevo.png)

Mensaje de registro exitoso
![alt text](/Pruebas/registro_exitoso.png)

Mensaje de creacion de Usuario exitoso
![alt text](/Pruebas/create_correcto.png)

Mensaje de inicio de sesion exitoso
![alt text](/Pruebas/inicio_sesion_correcto.png)

Mensaje de inicio de sesion no exitoso
![alt text](/Pruebas/inicio_sesion_incorrecto.png)

Coleccion Postman para prueba de servicio de inicio de sesion
![alt text](/Pruebas/prueba_servicio_login.png)

Coleccion Postman para prueba de servicio de registro
![alt text](/Pruebas/prueba_servicio_registro.png)

Ejemplo de peticion hacia servidor desde el frontend con el uso de AJAX
![alt text](/Pruebas/peticion_ajax.png)





