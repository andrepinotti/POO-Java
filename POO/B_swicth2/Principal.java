/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_swicth2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        
        Mes mesano = new Mes();
        int mes;
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                + "número do mês do ano: "));
        
        
        JOptionPane.showMessageDialog(null, mesano.respectivomes(mes));
    }
}
