package app.interfaces;

public interface SeguridadInterface {
    boolean login(String correo, String contraseña);
    void logout();
    void registrarUsuario(String nombre, String correo, String contraseña, boolean rol, int telefono, String direccion);


}
