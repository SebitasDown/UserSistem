package app.Menus;
import javax.swing.JOptionPane;
import app.Service.ClienteService;
import app.seguridad.SeguridadPersona;

public class rolCliente {
    private ClienteService service;
    public rolCliente(SeguridadPersona seguridad) {
        this.service = new ClienteService(seguridad);
    }
    public void MostrarMenuCliente() {
        int opcion;
        do {
            String menu = """
                    ====== Menú Cliente ====== 
                    1. Actualizar Datos
                    2. cerrar sesión
                    ================================
                    Ingrese una opción:
                    """;

            String input = JOptionPane.showInputDialog(menu);

            try{
                opcion = Integer.parseInt(input);
            }catch(NumberFormatException e){
                opcion = 0;
            }
            switch (opcion) {
                case 1 -> service.menuActualizarDatos();
                case 2 -> JOptionPane.showMessageDialog(null, "Cerrando sesión...");
            }
        }while (opcion != 2);
        }
}
