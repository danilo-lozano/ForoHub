# ForoHub

ForoHub es una plataforma de foro en línea que permite a los usuarios interactuar y discutir sobre temas relacionados con cursos. Este proyecto está desarrollado utilizando **Spring Boot**, **JWT** para la autenticación y **MySQL** como base de datos.

## Características

- **Autenticación mediante JWT**: Los usuarios pueden iniciar sesión con su nombre de usuario y contraseña, y recibir un token JWT para acceder a los recursos protegidos.
- **Gestión de temas**: Los usuarios pueden consultar y agregar temas (tópicos) relacionados con cursos.
- **Base de datos MySQL**: Todos los datos del foro, como los temas y los usuarios, se almacenan en una base de datos MySQL.

## Requisitos

- **Java 11 o superior**: Necesitarás tener Java 11 o superior instalado para ejecutar la aplicación.
- **MySQL**: La base de datos utilizada es MySQL. Necesitarás tener MySQL instalado y configurado.
- **Git**: Para gestionar el código fuente y trabajar con el repositorio.
- **GitHub**: Si deseas contribuir al proyecto o clonar el repositorio.

## Instalación

### 1. Clonar el repositorio

Primero, clona el repositorio a tu máquina local:

```bash
git clone https://github.com/TuUsuario/ForoHub.git

## Estructura del proyecto

ForoHub/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── forohub/
│   │   │   │       ├── ForoHubApplication.java
│   │   │   │       ├── AuthController.java   
│   │   │   │       ├── SecurityConfig.java
│   │   │   │       ├── TokenService.java
│   │   │   │       ├── Topic.java
│   │   │   │       ├── TopicController.java
│   │   │   │       ├── TopicRepository.java
│   │   │   │       ├── TopicService.java
│   │   │   │       ├── User.java
│   │   │   │       ├── UserLoginDTO.java   
│   │   │   │       ├── UserRepository.java
│   │   │   │       └── UserService.java
│   │   │   └── resources/
│   │   │       └── application.properties
├── pom.xml
└── README.md



