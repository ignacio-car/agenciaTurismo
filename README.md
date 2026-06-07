
# Sistema de Agencia de Turismo

## Descripción

Este proyecto consiste en el desarrollo de un sistema básico en Java utilizando Programación Orientada a Objetos (POO). El sistema permite representar personas asociadas a una agencia de turismo, incorporando herencia y composición entre clases.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

### model

Contiene las clases del dominio:

* **Persona**: Clase base con datos generales.
* **Direccion**: Clase utilizada como composición para almacenar la dirección.
* **Empleado**: Clase que hereda de Persona y agrega atributos específicos.

### app

* **Main**: Clase principal donde se crean objetos y se ejecuta el programa.

## Funcionalidad

El sistema permite:

* Crear objetos de tipo Empleado.
* Asociar una Dirección a cada persona (composición).
* Aplicar herencia entre Persona y Empleado.
* Mostrar la información en consola utilizando el método `toString()`.

## Ejecución

Para ejecutar el programa:

1. Abrir el proyecto en IntelliJ IDEA.
2. Ubicar la clase `Main`.
3. Ejecutar el método `main`.

## Conceptos aplicados

* Encapsulamiento (atributos privados y getters/setters)
* Herencia (`Empleado` extiende de `Persona`)
* Composición (`Persona` contiene `Direccion`)
* Sobrescritura de métodos (`toString()`)

## Autor

* Ignacio Carvacho
