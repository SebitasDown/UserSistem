# UserSistem

Sistema de gestión de usuarios con interfaz gráfica basada en Java Swing.

## Estructura del Proyecto

```
src/
  app/
    Main.java
    interfaces/
      AdministradorInterface.java
      ClienteInterface.java
      SeguridadInterface.java
    Menus/
      LoginRegister.java
      rolAdmin.java
      rolCliente.java
    Model/
      administrador.java
      Cliente.java
      Usuario.java
    seguridad/
      SeguridadPersona.java
    Service/
      ClienteService.java
      LoginRegisterService.java
      ServiceAdmin.java
    ultills/
      UtilRegisterLogin.java
```

## Descripción

Este sistema permite:
- Registro y login de usuarios (clientes y administradores)
- Gestión de sesiones
- Actualización de datos de usuario
- Listado y bloqueo/desbloqueo de clientes (solo administradores)

## Cómo ejecutar

1. Asegúrate de tener Java instalado (JDK 17+ recomendado).
2. Compila el proyecto desde la raíz del directorio `src`:
   ```sh
   javac app/Main.java
   ```
3. Ejecuta la aplicación:
   ```sh
   java app.Main
   ```

## Créditos

Desarrollado por SebitasDown.
