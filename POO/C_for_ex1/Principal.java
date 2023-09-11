/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        
        tabuada tab= new tabuada();
        
        //vamos receber o número e mostrar
        JOptionPane.showMessageDialog(null, tab.calcular(Integer.parseInt(
                JOptionPane.showInputDialog("Digite o número para a tabuada: "))));
    }
}
