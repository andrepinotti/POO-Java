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
public class Cardapio_DAO {
    
    public String cardapioConta (Cardapio_DTO cardapio_DTO){
        double soma=0;
        String itens = "";
        int opc;
       
       do{
            cardapio_DTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n"
                    + "1-Hamburguer"
                    + "\n2-Cheeseburguer"
                    + "\n3-Misto Quente"
                    + "\n4-Americano"
                    + "\n5-Queijo Prato")));
            if(cardapio_DTO.getOpc()==1) {
                
                    cardapio_DTO.setProduto(cardapio_DTO.getProduto()+"Hamburguer ");
                    cardapio_DTO.setConta(1.5);

                    soma += cardapio_DTO.getConta();
                  
            }
            else if(cardapio_DTO.getOpc()==2){
                    cardapio_DTO.setProduto(cardapio_DTO.getProduto()+"Cheeseburger ");
                    cardapio_DTO.setConta(1.8);
                    soma+= cardapio_DTO.getConta();
            }
             else if(cardapio_DTO.getOpc()==3){
                    cardapio_DTO.setProduto(cardapio_DTO.getProduto()+"Misto Quente ");
                    cardapio_DTO.setConta(1.2);
                    soma+= cardapio_DTO.getConta();
            }
            else if(cardapio_DTO.getOpc()==4){
                    cardapio_DTO.setProduto(cardapio_DTO.getProduto()+"Americano ");
                    cardapio_DTO.setConta(2.0);
                    soma+= cardapio_DTO.getConta();
            }
            else if(cardapio_DTO.getOpc()==5){
                    cardapio_DTO.setProduto(cardapio_DTO.getProduto()+"Queijo Prato ");
                    cardapio_DTO.setConta(1.0);
                    soma+= cardapio_DTO.getConta();
            }
             
                    
    
            
            
        }while(cardapio_DTO.getOpc() != 0);
       
       return "Soma:"+soma + ", Produto:"+cardapio_DTO.getProduto();
       
       
    
}
}

