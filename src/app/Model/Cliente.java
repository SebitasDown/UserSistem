package app.Model;

public class Cliente extends Usuario{

    private boolean bloqueador;
    private String direccion;
    private int telefono;

    public Cliente(String nombre, boolean rol, String correo, String contraseña) {
        super(nombre, rol, correo, contraseña);

        setBloqueador(bloqueador);
    }


    public void setBloqueador(boolean bloqueador) {
        this.bloqueador = bloqueador;
    }
    public boolean getBloqueador(){
        return bloqueador;
    }

    public void setDireccion(){ this.direccion = direccion;}
    public String getDireccion(String direccion){ return direccion;}

    public void setTelefono() {this.telefono = telefono;}
    public int getTelefono(int telefono){ return telefono;}

    @Override
    public String getSaludo() {
        return "";
    }
}
