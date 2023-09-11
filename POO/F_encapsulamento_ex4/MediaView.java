/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex4;

import javax.swing.JOptionPane;

public class MediaView {
    public static void main(String[] args) {
        
    //criar os objetos 
        MediaDAO mediaDAO = new MediaDAO();
        MediaDTO mediaDTO = new MediaDTO();
    try{   
    //vamos receber os valores 
    mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog(""
            + "Digite a primeira nota: ")));
    
    mediaDTO.setNota(Double.parseDouble(JOptionPane.showInputDialog(""
            + "Digite a segunda nota: ")));
    
   JOptionPane.showMessageDialog(null, mediaDAO.calculaMedia(mediaDTO));
    }
    catch(Exception e){
        System.out.println("Digite somente valores numéricos: "+e.getMessage());
    }
    }
    
}
