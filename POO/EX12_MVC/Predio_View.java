/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX12_MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Predio_View {
    public static void main(String[] args) {
        Predio_DTO predio_DTO = new Predio_DTO();
        Predio_DAO predio_DAO = new Predio_DAO();
        
        try{
        predio_DAO.pessoasPredio(predio_DTO);
        }
        catch(Exception e){
            System.out.println("Erro"+e.getMessage());
        }
    }
}
