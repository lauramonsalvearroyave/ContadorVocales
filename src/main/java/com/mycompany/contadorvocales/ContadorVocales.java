package com.mycompany.contadorvocales;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class ContadorVocales {

    public static void main(String[] args) {
        int contador = 0;
        String entrada = JOptionPane.showInputDialog("Ingrese una cadena de texto").toLowerCase();
        for (int i=0; i<entrada.length();i++){
            if (entrada.charAt(i)=='a' || entrada.charAt(i)=='e' || entrada.charAt(i)=='i' || entrada.charAt(i)=='o' || entrada.charAt(i)=='u')
                contador++;
        }
        JOptionPane.showMessageDialog(null,"La palabra "+ entrada+ " tiene "+ contador + " vocales");
    }
}
