package app.ultils;

import javax.swing.*;

public class UtilRegisterLogin {

    public static String leerString(String mensaje){
        while(true){
            String entrada = JOptionPane.showInputDialog(null, mensaje);

            if(entrada == null){
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return null;
            }
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

            if(entrada == null){
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
                return null;
            }

            entrada = entrada.trim();
            if (entrada.isEmpty()){
                JOptionPane.showMessageDialog(null, "No puede estar vacio");
                continue;
            }
            return entrada;
        }
    }

    public static int leerNumeros (String mensaje){
        int numero = 0;
        boolean valido = false;

        while(!valido) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if(input == null){
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                    return -1; // VALOR QUE INDICA CANCELACION
                }
                numero = Integer.parseInt(input);
                valido = true; // Salir del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Caracteres no validos");
            }
        }
        return numero;
    }
}
