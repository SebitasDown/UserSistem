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

    @Override
    public String getSaludo() {
        return "";
    }
}
