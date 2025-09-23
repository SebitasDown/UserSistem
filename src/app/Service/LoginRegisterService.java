package app.Service;

import app.Menus.LoginRegister;
import app.ultils.UtilRegisterLogin;
import app.seguridad.SeguridadPersona;
import javax.swing.JOptionPane;

public class LoginRegisterService {
    private SeguridadPersona seguridad;

    public LoginRegisterService(SeguridadPersona seguridad){
        this.seguridad = seguridad;
    }

    public void iniciarSesion(){
        String correo = UtilRegisterLogin.leerOtroTipoString("Ingrese su correo: ");
        String contraseña = UtilRegisterLogin.leerOtroTipoString("Ingrese la contraseña: ");
        if(correo != null && contraseña != null){
            seguridad.login(correo, contraseña);
        }
    }
    public void Registrarse(){
        String nombre = UtilRegisterLogin.leerString("nombre: ");
        String correo = UtilRegisterLogin.leerOtroTipoString("correo: ");
        String contraseña = UtilRegisterLogin.leerOtroTipoString("Contraseña: ");

        // Mini desplegable para elegir role
        String[] roles = {"ADMIN", "CLIENTE"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el rol: ",
                "Rol de usuario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                roles,
                roles[1]
        );

        if(seleccion == null){
            JOptionPane.showInputDialog(null, "Registro cancelado");
            return;
        }
        boolean rol = seleccion.equals("ADMIN");

        int telefono = 0;
        String direccion = "";

        if(!rol){
            try{
                telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: "));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Caracteres no validos");
                telefono = 0;
            }
            direccion = JOptionPane.showInputDialog("Ingrese el direccion: ");
        }
        seguridad.registrarUsuario(nombre, correo,contraseña, rol, telefono, direccion);
    }
}
