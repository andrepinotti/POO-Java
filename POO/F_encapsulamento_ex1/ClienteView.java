/*
 * Cliente view se da a interação com o usuário
*/
package F_encapsulamento_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ClienteView {
    public static void main(String[] args) {
        
    
    //Vamos criar objetos
    ClienteDTO  clienteDTO = new ClienteDTO();
    ClienteDAO clienteDAO = new ClienteDAO(); 
    
    //vamos atribuir um valor, pelo usuário, na variável nome
    clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome: "));
    
    //variável idade
    clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
    
    //variável rg
    clienteDTO.setRG(JOptionPane.showInputDialog("Digite o RG: "));
    
    //mostar os dados que o usuário receba
    JOptionPane.showMessageDialog(null, clienteDAO.mostraNomeIdade(clienteDTO));
    JOptionPane.showMessageDialog(null, clienteDAO.mostraNomeRg(clienteDTO));
    }
}