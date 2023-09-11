/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2_MVC;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class AlturaPeso_View {
    public static void main(String[] args) {
        
        //vamos criar os objetos
        AlturaPeso_DAO alturaPeso_DAO = new AlturaPeso_DAO();
        AlturaPeso_DTO alturaPeso_DTO = new AlturaPeso_DTO();
        
       //vamos receber os valores dos atributos 
       try {
        alturaPeso_DTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        alturaPeso_DTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")));
        
        JOptionPane.showMessageDialog(null, alturaPeso_DAO.categoriaPessoa(alturaPeso_DTO));
       }
       catch(Exception e){
           System.out.println("Digite somente valores numéricos."+e.getMessage());
       }
    }
}
