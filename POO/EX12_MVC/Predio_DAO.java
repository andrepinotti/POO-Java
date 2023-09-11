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
public class Predio_DAO {
    public void pessoasPredio(Predio_DTO predio_DTO){
        
        predio_DTO.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de andares que"
                + " o prédio tem: ")));
        for(int i=0; i<predio_DTO.getAndar(); i++){
            
            predio_DTO.setNentra(Integer.parseInt(JOptionPane.showInputDialog
        ("Quantas pessoas vão entrar: ")));
            predio_DTO.setNsai(Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas vão sair: ")));
            if(predio_DTO.getNentra()-predio_DTO.getNentra()>15){
            
                JOptionPane.showMessageDialog(null, "Excesso de passageiros.");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Número acessível.");
            }
        }            
    
    
        
    }
}
