package app.Service;

import app.ultils.UtilRegisterLogin;
import app.seguridad.SeguridadPersona;

import javax.swing.*;

public class ClienteService {
    private SeguridadPersona seguridad;
    public ClienteService(SeguridadPersona seguridad) {
        this.seguridad = seguridad;
    }
    public  void menuActualizarDatos (){
        String[] opciones = {"Actualizar correo", "Actualizar Telefono"};

        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "¿Que desea actualizar?",
                "Menu de Actualizacion",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]

        );
        if(seleccion == null){
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
            return;
        }

        switch (seleccion){
            case "Actualizar correo" -> ActualizarCorreo();
            case "Actualizar Telefono" -> ActualizarTelefono();
        }


    }
    public void ActualizarCorreo(){
        String nuevocorreo = UtilRegisterLogin.leerOtroTipoString("Ingrese su nuevo correo: ");
        if(nuevocorreo != null && !nuevocorreo.isBlank()){
            seguridad.getUsuarioLogueado().setCorreo(nuevocorreo);
            JOptionPane.showMessageDialog(null, "Correo actualizado correctamente");
        }
    }

    public void ActualizarTelefono(){
        int nuevotelefono = UtilRegisterLogin.leerNumeros("Ingrese su nuevo telefono: ");

    }
}
