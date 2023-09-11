/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX4_MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class PesquisaView {
    public static void main(String[] args) {
        //criar os objetos 
        PesquisaDTO pesquisaDTO = new PesquisaDTO();
        PesquisaDAO pesquisaDAO = new PesquisaDAO();
        
        try{
            JOptionPane.showMessageDialog(null, pesquisaDAO.pesquisaCidade(pesquisaDTO));
        }
        catch(Exception e){
            System.out.println("Erro");
        }
    }
}
