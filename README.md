# DesafioLiterAlura
Desafio LiterAlura!
<p> En esta oportunidad vamos a aplicar los conocimientos adquiridos en los cursos (
Curso de
Java: trabajando con lambdas, streams y Spring Framework
  y
  Curso de
Java: persistencia de datos y consultas con Spring Data JPA)</p>

## Descripción  
Aplicación en Java 21 desarrollada con Spring Boot que permite interactuar con la API pública de [Gutendex](https://gutendex.com/) para gestionar información sobre libros y autores.  
El programa es **de consola**, sin interfaz gráfica, y utiliza una base de datos PostgreSQL para almacenar y consultar los datos obtenidos.

---

## Tecnologías utilizadas  
- Java 21  
- Spring Boot  
- PostgreSQL  
- IntelliJ IDEA (IDE)  
- REST API Gutendex  

---

## Funcionalidades principales  

El usuario puede elegir entre distintas opciones en el menú de consola:  

1. Agregar un libro por nombre (se consulta la API y se guarda en la base de datos)  
2. Listar todos los libros guardados  
3. Buscar libro por nombre en la base de datos  
4. Listar todos los autores de los libros guardados  
5. Buscar autores por año de nacimiento (consulta en base de datos)  
6. Buscar libros por idioma (base de datos)  
7. Mostrar el Top 10 de libros más descargados (base de datos)  
8. Buscar autor por nombre (base de datos)  
0. Salir de la aplicación  

---

## Instalación y ejecución  

Dado que es un desafío para clase, estos pasos son orientativos:  

- Clonar el repositorio.  
- Configurar la conexión a la base de datos PostgreSQL en `application.properties` o `application.yml`.  
- Construir y ejecutar el proyecto desde IntelliJ o mediante Maven/Gradle.  
- Interactuar con el menú en consola.  
- Para salir, ingresar `0`.  

---

## Cómo funciona  

- El usuario ingresa una opción en el menú.  
- Para agregar libros, la aplicación consume la API de Gutendex, obtiene los datos y los guarda en la base de datos.  
- Para las búsquedas y listados, se consulta la base de datos.  
- La aplicación permanece activa hasta que el usuario ingresa `0` para salir.  
