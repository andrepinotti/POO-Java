/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FuncionarioView {
    public static void main(String[] args) {
     
    //criar os objetos    
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
    FuncionamentoDAO funcionarioDAO = new FuncionamentoDAO();    
        
    //vamos receber os valores 
    funcionarioDTO.setNome(JOptionPane.showInputDialog("Digite o nome: "));
    funcionarioDTO.setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
    funcionarioDTO.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário: ")));
    funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
    
    //mostrar os resultados
    JOptionPane.showMessageDialog(null, funcionarioDAO.mostraDados(funcionarioDTO));
    
    } 
}

