package app.Model;

public abstract class Usuario {
    private String nombre;
    private boolean rol;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, boolean rol, String correo, String contraseña) {
        setContraseña(contraseña);
        setCorreo(correo);
        setNombre(nombre);
        setRol(rol);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setRol(boolean rol){
        this.rol = rol;
    }
    public boolean getRol() {
        return rol;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public abstract String getSaludo();


}
