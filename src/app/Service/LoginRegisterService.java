package app.Service;

import app.Menus.LoginRegister;
import app.Model.Usuario;
import app.ultils.UtilRegisterLogin;
import app.seguridad.SeguridadPersona;
import javax.swing.JOptionPane;
import app.Menus.rolCliente;
import app.Menus.rolAdmin;

public class LoginRegisterService {
    private SeguridadPersona seguridad;
    private rolCliente menu ;
    private rolAdmin menuAdmin;

    public LoginRegisterService(SeguridadPersona seguridad){
        this.seguridad = seguridad;
        this.menu = new rolCliente(seguridad);   // le pasamos la misma seguridad
        this.menuAdmin = new rolAdmin(seguridad); // idem admin
    }

    public void iniciarSesion(){

        String correo = UtilRegisterLogin.leerOtroTipoString("Ingrese su correo: ");
        String contraseña = UtilRegisterLogin.leerOtroTipoString("Ingrese la contraseña: ");
        if(correo != null && contraseña != null){
            if (seguridad.login(correo, contraseña)){
                Usuario u = seguridad.getUsuarioLogueado();
                if(u.getRol()){
                    menuAdmin.MostrarMenuAdmin();
                }else{
                    menu.MostrarMenuCliente();
                }
            }
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
            JOptionPane.showMessageDialog(null, "Registro cancelado");
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
            direccion = JOptionPane.showInputDialog("Ingrese la direccion: ");
        }
        seguridad.registrarUsuario(nombre, correo,contraseña, rol, telefono, direccion);
    }
}
