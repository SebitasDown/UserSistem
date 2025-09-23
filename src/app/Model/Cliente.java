package app.Model;

public class Cliente extends Usuario{

    private boolean bloqueador;
    private String direccion;
    private int telefono;

    public Cliente(String nombre, boolean rol, String correo, String contraseña, int telefono, String direccion) {
        super(nombre, rol, correo, contraseña);

        setBloqueador(bloqueador);
        setDireccion(direccion);
        setTelefono(telefono);
    }



    public void setBloqueador(boolean bloqueador) {
        this.bloqueador = bloqueador;
    }
    public boolean getBloqueador(){
        return bloqueador;
    }

    public void setDireccion(String direccion){ this.direccion = direccion;}
    public String getDireccion(){ return direccion;}

    public void setTelefono(int telefono) {this.telefono = telefono;}
    public int getTelefono(){ return telefono;}

    @Override
    public String getSaludo() {
        return "";
    }
}
