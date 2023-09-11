/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_exceçao_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        //criar o objeto
        Divisão divisao = new  Divisão();
        
        double numero, valor; 
        try{
        numero = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o número a ser dividido: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o divisor: "));
        //chamamos o método para dividir 
        divisao.calculaDivisao(numero, valor);
        }
         catch(Exception e){
           System.out.println(
                   "Erro: "+e.getMessage());
       }
    }
 
}
