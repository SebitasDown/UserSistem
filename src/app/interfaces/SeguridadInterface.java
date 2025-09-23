package app.interfaces;

public interface SeguridadInterface {
    boolean login(String correo, String contrasena);
    void logout();
    void registrarUsuario(String nombre, String correo, String contrasena);


}
