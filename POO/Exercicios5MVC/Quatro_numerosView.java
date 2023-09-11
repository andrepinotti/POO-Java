/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios5MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Quatro_numerosView {
    public static void main(String[] args) {
          Quatro_numerosDAO quatro_numerosDAO = new Quatro_numerosDAO();
        Quatro_numerosDTO quatro_numerosDTO = new Quatro_numerosDTO();
       
            JOptionPane.showMessageDialog(null, "Digite os quatro números em "
                    + "ordem crescente.");
            quatro_numerosDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: ")));
            quatro_numerosDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: ")));
            quatro_numerosDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3: ")));
            quatro_numerosDTO.setNum4(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 4: ")));
    
           JOptionPane.showMessageDialog(null, quatro_numerosDAO.ordenar_Numeros(quatro_numerosDTO));
    }
    
      
}
