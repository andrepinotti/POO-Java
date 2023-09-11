/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MVC_View {
    public static void main(String[] args) {
        //criar objetos
        MVC_DTO mvc_DTO = new MVC_DTO();
        MVC_DAO mvc_DAO = new MVC_DAO();
        
        try{
        //receber as variáveis
            mvc_DTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1: ")));
            mvc_DTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: ")));
            mvc_DTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3: ")));
            
            JOptionPane.showMessageDialog(null, mvc_DAO.OrdemCrescente(mvc_DTO));
        }
        catch (Exception e){
            System.out.println("Digite apenas valores numéricos."+e.getMessage());
        }
    }
}
