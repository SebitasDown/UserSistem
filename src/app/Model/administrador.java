package app.Model;

public class administrador extends Usuario {



    public administrador(String nombre, boolean rol, String correo, String contraseña) {
        super(nombre, rol, correo, contraseña);
    }

    @Override
    public String getSaludo() {
        return "";
    }
}
