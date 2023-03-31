# API del Sistema de Gestión de la carrera de Informática Empresarial | SIGIE


Con este API, las aplicaciones clientes pueden obtener información detallada acerca de los planes de estudio de la carrera de Informática Empresarial. Esto permite a los usuarios acceder a información precisa y actualizada sobre los cursos y asignaturas de la carrera, lo que puede ser útil para tomar decisiones informadas acerca de su educación y planificar su progreso académico.

Estas son algunas de las caracteríscas del API:

- Desarrollado con Spring Boot en su versión Java 11.
- Sigue los principios RESTful.
- Utiliza JSON como formato de intercambio de datos.

--- 
## Requisitos

Para ejecutar este API, se requiere lo siguiente:

1. Java 11 o posterior instalado en el sistema.
2. Un IDE compatible con Spring Boot, como Eclipse o IntelliJ IDEA.
3. Una base de datos MySQL.

## Instrucciones de uso

Para usar este API, siga estos pasos:

1. Clone el repositorio en su máquina local.
2. Configure la base de datos MySQL en el archivo [application.properties](src\main\resources\application.properties).
3. Inicie el API ejecutando la clase [SigieBackendApplication](src\main\java\cr\ac\ucr\ie\sigie\SigieBackendApplication.java).
4. Explore los endpoints disponibles en el API y utilice una herramienta como Postman o cURL para interactuar con ellos.
