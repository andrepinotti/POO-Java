/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introdução10;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        int lado1, lado2;
        
        Areaquadrilatero areaQuadrilatero = new Areaquadrilatero();
        
        lado1=Integer.parseInt(JOptionPane.showInputDialog("Informe o lado 1: "));
        lado2=Integer.parseInt(JOptionPane.showInputDialog("Informe o lado 2: "));
        
        areaQuadrilatero.area(lado1, lado2);
        
    }
}
