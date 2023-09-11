/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introdução7;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
    
        OrdemCrescente ordemCrescente = new OrdemCrescente(); 
    
        int num1, num2, escolha;

        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        escolha=Integer.parseInt(JOptionPane.showInputDialog("Escolha 1 para ordem "
                + "crescente e 2 para ordem decrescente: "));
    
    
    
        ordemCrescente.ordenador(num1, num2, escolha);
        
        
    }
}
