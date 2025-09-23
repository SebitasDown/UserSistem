package app.Model;

public class administrador extends Usuario {



    public administrador(String nombre, boolean rol, String correo, String contraseña, int telefono, String direccion) {
        super(nombre, rol, correo, contraseña);
    }

    @Override
    public String getSaludo() {
        return "";
    }
}
