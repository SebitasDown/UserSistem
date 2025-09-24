package app.Model;

import app.interfaces.ClienteInterface;

public class Cliente extends Usuario implements ClienteInterface {

    private boolean bloqueado;
    private String direccion;
    private int telefono;

    public Cliente(String nombre, boolean rol, String correo, String contraseña, int telefono, String direccion) {
        super(nombre, rol, correo, contraseña);

        setBloqueador(false);
        setDireccion(direccion);
        setTelefono(telefono);
    }



    public void setBloqueador(boolean bloqueador) {
        this.bloqueado = bloqueado;
    }
    public boolean getBloqueador(){
        return bloqueado;
    }

    public void setDireccion(String direccion){ this.direccion = direccion;}
    public String getDireccion(){ return direccion;}

    public void setTelefono(int telefono) {this.telefono = telefono;}
    public int getTelefono(){ return telefono;}

    @Override
    public String getSaludo() {
        return "";
    }


    @Override
    public String actualizarCorreo(String nuevocorreo) {
        if (nuevocorreo != null && nuevocorreo.contains("@")) {
            this.setCorreo(nuevocorreo);
            return "Correo actualizado correo";
        }
        return "No se pudo actualizar el correo";
    }

    @Override
    public int actualizarTelefono(int nuevotelefono) {
        this.setTelefono(nuevotelefono);
        return nuevotelefono;
    }
}
