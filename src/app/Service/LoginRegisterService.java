package app.Service;

import app.Menus.LoginRegister;
import app.seguridad.SeguridadPersona;
import javax.swing.JOptionPane;

public class LoginRegisterService {
    private SeguridadPersona seguridad;

    public LoginRegisterService(SeguridadPersona seguridad){
        this.seguridad = seguridad;
    }

    public void iniciarSesion(){
        String correo = JOptionPane.showInputDialog("Ingrese su corrreo: ");
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña: ");
        if(correo != null && contraseña != null){
            seguridad.login(correo, contraseña);
        }
    }
    public void Registrarse(){
        String nombre = JOptionPane.showInputDialog("nombre: ");
        String correo = JOptionPane.showInputDialog("correo: ");
    }
}
