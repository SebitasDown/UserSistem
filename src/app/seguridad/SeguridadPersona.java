package app.seguridad;

import app.interfaces.SeguridadInterface;
import app.Model.Usuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SeguridadPersona implements SeguridadInterface{
    private List<Usuario> usuariosRegistrados = new ArrayList<>();
    private Usuario usuarioLogueado = null;

    @Override
    public boolean login(String correo, String contraseña) {
        for (Usuario u: usuariosRegistrados){
            if(u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña)){
                usuarioLogueado = u;
                JOptionPane.showMessageDialog(null, "Usuario Logueado");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario Logueado");
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public void registrarUsuario(String nombre, String correo, String contrasena) {

    }

}
