/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_case;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        //variáveis globais     
      Operacao operacao = new Operacao(); 
      int n1, n2, opcao;
      
      n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
      n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
      opcao=Integer.parseInt(JOptionPane.showInputDialog("Informe qual a operação"
              + "desejada\n(1-Soma 2-Subtração): "));
      //como o método calcular retorn uma string, então podemos chamá-lo dentro
      // de um show message dialog.
      
      
        JOptionPane.showMessageDialog(null, operacao.calcular(opcao, n1, n2));
      
    }
}
