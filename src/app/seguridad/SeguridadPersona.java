package app.seguridad;

import app.interfaces.SeguridadInterface;
import app.Model.Usuario;
import app.Model.Cliente;
import app.Model.administrador;

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
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        return false;
    }

    @Override
    public void logout() {
        if(usuarioLogueado != null){
            JOptionPane.showMessageDialog(null, "Sesion Cerrada");
            usuarioLogueado = null;
        }else{
            JOptionPane.showMessageDialog(null, "No hay sesion REGISTRATE PENDEJO KAKKAKAsdkasd");
        }
    }

    @Override
    public void registrarUsuario(String nombre, String correo, String contraseña, boolean rol, int telefono, String direccion) {
        Usuario nuevo;
        if (rol){
            nuevo = new administrador(nombre, rol, correo, contraseña,);
        } else {
            nuevo = new Cliente(nombre, rol, correo, contraseña);
        }
        usuariosRegistrados.add(nuevo);
        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente" + (rol ? "ADMIN" : "CLIENTE"));
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }
}
