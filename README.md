# API del Sistema de Gestión de la carrera de Informática Empresarial | SIGIE

Con este API, las aplicaciones clientes pueden **obtener información detallada acerca de los planes de estudio de la carrera de Informática Empresarial.** Esto permite a los usuarios acceder a información precisa y actualizada sobre los cursos y asignaturas de la carrera, lo que puede ser útil para tomar decisiones informadas acerca de su educación y planificar su progreso académico.

Estas son algunas de las caracteríscas del API:

- Desarrollado con Spring Boot en su versión Java 11.
- Sigue los principios RESTful.
- Utiliza JSON como formato de intercambio de datos.

---

## Requisitos

Para ejecutar este API, se requiere lo siguiente:

1. **Java 11** o posterior instalado en el sistema.
2. Un **IDE compatible con Spring Boot**, como Eclipse o IntelliJ IDEA.
3. Una base de datos **MySQL**.

## Instrucciones de uso

Para usar este API, siga estos pasos:

1. Clone el repositorio en su máquina local.
2. Configure la base de datos MySQL en el archivo [application.properties](src\main\resources\application.properties).
3. Configure las [variables de entorno](#variables_entorno).
4. Inicie el API ejecutando la clase [SigieBackendApplication](src\main\java\cr\ac\ucr\ie\sigie\SigieBackendApplication.java).
5. Explore los endpoints disponibles en el API y utilice una herramienta como Postman o cURL para interactuar con ellos.


## Instrucciones de uso con Docker

Para usar este API con docker, siga estos pasos:

### Crear y ejecutar contenedor de docker

```bash
$ docker build -t sigie-backend .
```

```bash
$ docker run -p 8080:8080 -e DATABASE_URL=jdbc:mysql://host:3306/database_name?createDatabaseIfNotExist=TRUE -e DATABASE_USERNAME=your_user -e DATABASE_PASSWORD=your_password sigie-backend
```

Nota: Si necesitas crear la base de datos, debes agregar la variable de entorno `DDL_AUTO=create`.

### Docker compose

Ejecuta la el servidor base de datos y el api como contenedores de docker utilizando docker-compose:

```bash
$ docker-compose up
```

Vuelve a compilar el proyecto con docker-compose:
```bash
$ docker-compose up --build
```

## Variables de entorno {#variables_entorno}

- [¿Cómo configurar variables de entorno en IntelliJ?](https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html)

El siguiente es un listado de las variables de entorno necesarias para configurar y ejecutar el API del Sistema de Gestión de la carrera de Informática Empresarial:

#### `PORT`

El puerto en el que se ejecutará el servidor. Por defecto, se utiliza el puerto `8080`.

#### `DATABASE_URL`

La URL de la base de datos MySQL a la que se conectará el API. Debe seguir el siguiente formato y reemplace los valores correspondientes: `jdbc:mysql://{db_host}:{db_port:3306}/{db_name}?createDatabaseIfNotExist={true|false}`

#### `DATABASE_USERNAME`

El nombre de usuario que se utilizará para autenticar la conexión a la base de datos.

#### `DATABASE_PASSWORD`

La contraseña que se utilizará para autenticar la conexión a la base de datos.

#### `SQL_PLATFORM`

La plataforma de SQL utilizada por Hibernate. Las opciones son: `h2`, `mysql` ó `postgresql`. Por defecto utiliza `mysql`.

#### `SHOW_SQL`

Indica si se deben mostrar las consultas SQL generadas por Hibernate en la consola. Por defecto utiliza el valor `false`.

#### `DDL_AUTO`

Controla el modo de actualización de la base de datos en el arranque de la aplicación. Las opciones permitidas son: `none`, `create`, `create-drop`, `validate` ó `update`. Utiliza `validate` por defecto.

#### `CHAR_SET`

El conjunto de caracteres que se utilizará para codificar los datos. Los valores pueden ser `UTF-8`, `ISO-8859-1` ó `US-ASCII` Utiliza `UTF-8` por defecto.

Es importante asegurarse de que estas variables de entorno estén configuradas correctamente antes de iniciar el API.
