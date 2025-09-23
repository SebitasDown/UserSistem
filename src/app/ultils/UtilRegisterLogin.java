package app.ultils;

import javax.swing.*;

public class UtilRegisterLogin {

    public static String leerString(String mensaje){
        while(true){
            String entrada = JOptionPane.showInputDialog(null, mensaje);

            entrada = entrada.trim();
            if (entrada.isEmpty()){
                JOptionPane.showMessageDialog(null, "No puede estar vacio");
                continue;
            }
            try {
                Double.parseDouble(entrada);
                JOptionPane.showMessageDialog(null,"No puedes poner un numero");
                continue;
            }catch(NumberFormatException e){
                return entrada;
            }
        }

    }
    public static String leerOtroTipoString(String mensaje){
        while(true){
            String entrada = JOptionPane.showInputDialog(null, mensaje);
            entrada = entrada.trim();
            if (entrada.isEmpty()){
                JOptionPane.showMessageDialog(null, "No puede estar vacio");
                continue;
            }
            return entrada;
        }
    }
}
