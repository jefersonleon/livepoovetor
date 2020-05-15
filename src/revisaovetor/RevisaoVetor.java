package revisaovetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class RevisaoVetor {

    public static void main(String[] args) {
        int[] x = new int[3];
        int cp = 0;//contador de par

        for (int i = 0; i < x.length; i++) {//inserindo valores no vetor
            x[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o valor"));
        }
        for (int i = 0; i < x.length; i++) { //verifica se no vetor existem elementos pares
            if (x[i] % 2 == 0) {
                cp++;
            }
        }
        if (cp == 0) {
            JOptionPane.showMessageDialog(null, "No vetor não existe valores pares");
        } else if (cp == 1) {
            JOptionPane.showMessageDialog(null, "No vetor existe " + cp
                    + " valor par");
        } else {
            JOptionPane.showMessageDialog(null, "No vetor existem " + cp
                    + " valores pares");
        }
    }
}
