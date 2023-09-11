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
public class PesquisaDAO {
    public String pesquisaCidade(PesquisaDTO pesquisaDTO){

        double media=0, mediahomem=0, mediamulher=0, mediamenor=0;
        int homem=0, mulher=0, total=0;
        int mulhermenor=0;
        double somasalario=0;
        
        
        do {
        pesquisaDTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog("Informe se"
                    + "deseja realizar a pesquisa "
                + "\n0-Sair"
                +"\n1-pesquisa")));
        
        if(pesquisaDTO.getOpc() == 1) {   
            
            pesquisaDTO.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario: ")));
            somasalario = somasalario +pesquisaDTO.getSalario();
            pesquisaDTO.setSexo(JOptionPane.showInputDialog("Informe o sexo(M/F): "));
            if(pesquisaDTO.getSexo() == "M"){
                homem++;
                total++;
                
            } else if(pesquisaDTO.getSexo() == "F"){
                mulher++;
                total++;
            }
            else if((pesquisaDTO.getSexo() == "F")&&(pesquisaDTO.getSalario()<=1890)){
                mulher++;
                mulhermenor=0;
                total++;
            }
        }
        
        }while(pesquisaDTO.getOpc() == 0);
        
        media = (somasalario/total)*100;
        mediahomem = (homem/total)*100;
        mediamulher = (mulher/total)*100;
        mediamenor = (mulhermenor/total)*100;
        
        return "Média Salarial: "+media+
                "\nMédia Homem: "+mediahomem+
                "\nMédia Mulher: "+mediamulher
                +"Média Inferior de Mulheres: ";
    }
}

        