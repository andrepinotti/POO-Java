/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PessoaView {
    public static void main(String[] args) {
        //vanmos criar os objetos 
        PessoaDTO pessoaDTO = new PessoaDTO();
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        pessoaDTO.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        pessoaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
       
        JOptionPane.showMessageDialog(null, pessoaDAO.mostraDados(pessoaDTO));
        JOptionPane.showMessageDialog(null, pessoaDAO.maiorMenor(pessoaDTO));
    }
}
