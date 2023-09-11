/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3_MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Cardapio_View {
    public static void main(String[] args) {
        
        //vamos criar os objetos
        Cardapio_DTO cardapio_DTO = new Cardapio_DTO();
        Cardapio_DAO cardapio_DAO = new Cardapio_DAO();
        //vamos receber os atributos 
        try{
        
           JOptionPane.showMessageDialog(null,cardapio_DAO.cardapioConta(cardapio_DTO));
        
        }
        catch(Exception e){
            System.out.println("Digite somente valores numéricos."+e.getMessage());
        }
    }
}
