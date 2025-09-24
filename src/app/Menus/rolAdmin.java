package app.Menus;
import app.Service.ServiceAdmin;
import app.seguridad.SeguridadPersona;

import javax.swing.JOptionPane;

public class rolAdmin {
    private ServiceAdmin service;

    public rolAdmin(SeguridadPersona seguridad) {
        this.service = new ServiceAdmin(seguridad);
    }

    public void MostrarMenuAdmin(){
        int opcion;
        do{
           String menu = """
                   
                       ====== Menú Administrador ======
                        1. Bloquear/Desbloquear Usuario
                        2. Listado de Usuarios
                        3. cerrar sesión
                        ================================
                        Ingrese una opción:
                        """;

              String input = JOptionPane.showInputDialog(menu);

              try {
                    opcion = Integer.parseInt(input);
              }catch(NumberFormatException e){
                  opcion = 0;
              }
              switch(opcion){
                  case 1 -> service.BloquearoDesbloquearUsuario();
                  case 2 -> service.listarUsuarios();
                  case 3 -> JOptionPane.showMessageDialog(null, "Cerrando sesión...");
              }
        }while(opcion != 3);
    }
}
