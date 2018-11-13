package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class xogo {

    private int num;
    private int intentos;
    private int respuesta;

    public void establecerXogo() {
        boolean correcto = false;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero entre 1 y 50:"));
            if (num > 0 && num <= 50) {
                correcto = true;
            } else {
                JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }
        } while (correcto == false);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos del juego:"));
    }

    public void iniciarXogo() {
        this.establecerXogo();
        for (int i = 0; i < intentos; i++) {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivinar numero entre 1 y 50:"));
            if (respuesta > num) {
                JOptionPane.showMessageDialog(null, "El número es menor");
            } else if (respuesta < num) {
                JOptionPane.showMessageDialog(null, "El número es mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Se han acabado los intentos");
    }
}
