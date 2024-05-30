## Instalación y Uso de Docker

Fuente: https://www.youtube.com/watch?v=_et7H0EQ8fY

## Instrucciones

1. Construir la imagen de Docker con el siguiente comando:

```bash
docker build -t miserver-mysql-22 .
```

2.- Ejecutar un contenedor con la imagen recién construida:

```bash
docker run -d -p 3306:3306 --name mysql-server-22 miserver-mysql-22
```

3.- Validar que el contenedor haya iniciado correctamente

```bash
docker ps
```

4.- Ingresar a la consola del contenedor de MySQL.

```bash
docker exec -it mysql-server-22 bash
```

5.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

6.- Crear nuestra base de datos

```sql
CREATE DATABASE grupo22;
```

7.- Utilizar nuestra base de datos

```sql
use grupo22;
```

8.- Crear una tabla Alumnas con los siguientes datos:

```sql
CREATE TABLE alumnas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(60),
    edad int(2)
);
```

9.- Insertar algunos registros

```sql
INSERT INTO alumnas (nombre, edad) VALUES
('Jacqueline Ramrez ', 26),
('Brenda Garcia', 26);
```

10.- Descargar previamente el MySQL-Connector desde esta [url](https://dev.mysql.com/downloads/connector/j/).

11.- Compilar nuestra clase haciendo uso de la librería.

```bash
javac -cp "ejerciciosClase/alumnas/lib/*" ejerciciosClase/alumnas/Grupo22.java
```

12.- Ejecutar nuestro proyecto

```bash
java -cp "ejerciciosClase/alumnas/lib/*:." ejerciciosClase.alumnas.Grupo22
```
