package app.Menus;
import app.Service.LoginRegisterService;
import app.seguridad.SeguridadPersona;
import javax.swing.JOptionPane;

public class LoginRegister  {
    private SeguridadPersona seguridad = new SeguridadPersona();
    private LoginRegisterService service = new LoginRegisterService(seguridad);
    public void MostrarMenuLoginRegister(){
        int opcion;
        do {
            String menu = """
                ======================
                  🔐  MENÚ DE ACCESO
                ======================
                
                1. Iniciar Sesión
                2. Registrarse
                3. Salir
                
                Seleccione una opción:
                """;
            String input = JOptionPane.showInputDialog(menu);
            if(input == null){
                break;
            }

           try {
               opcion = Integer.parseInt(input);
           }catch (NumberFormatException e){
               opcion = 0;
           }
           switch (opcion){
               case 1 -> service.iniciarSesion();
               case 2 ->

           }
        }while(opcion != 3);
    }
}
