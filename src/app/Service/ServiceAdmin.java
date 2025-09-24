package app.Service;

import app.Model.Cliente;
import app.ultils.UtilRegisterLogin;
import app.Model.Usuario;
import app.seguridad.SeguridadPersona;

import javax.swing.*;

public class ServiceAdmin {

    private SeguridadPersona seguridad;

    public ServiceAdmin(SeguridadPersona seguridad) {
        this.seguridad = seguridad;
    }

    public void listarUsuarios() {
        StringBuilder listado = new StringBuilder("Listado de Usuarios:\n");
        for (Usuario usuario : seguridad.getUsuariosRegistrados()) {
            listado.append("Nombre: ").append(usuario.getNombre())
                    .append(", Correo: ").append(usuario.getCorreo())
                    .append(", Rol: ").append(usuario.getRol() ? "Admin" : "Cliente");
            if (usuario instanceof Cliente cliente) {
                listado.append(", Bloqueado: ").append(cliente.getBloqueador() ? "Sí" : "No");
            }
            listado.append("\n");
        }
        JOptionPane.showMessageDialog(null, listado.toString());
    }


    public Usuario buscarUsuario(String correo) {
        for (Usuario usuario : seguridad.getUsuariosRegistrados()) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }


    public void BloquearoDesbloquearUsuario() {
        String correo = UtilRegisterLogin.leerString("Ingrese el correo del cliente: ");
        if (correo == null || correo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó ningún correo");
            return;
        }

        Usuario u = buscarUsuario(correo);

        if (u == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            return;
        }

        if (!(u instanceof Cliente cliente)) {
            JOptionPane.showMessageDialog(null, "Solo se pueden bloquear/desbloquear clientes");
            return;
        }

        // Menú desplegable
        String[] opciones = {"Bloquear", "Desbloquear"};
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione la acción para el cliente " + cliente.getNombre() + ":",
                "Bloquear / Desbloquear",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion == 0) { // Bloquear
            cliente.setBloqueador(true);
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNombre() + " bloqueado");
        } else if (seleccion == 1) { // Desbloquear
            cliente.setBloqueador(false);
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNombre() + " desbloqueado");
        }
    }
}