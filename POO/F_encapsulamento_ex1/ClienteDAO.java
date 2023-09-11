/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex1;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    //vamos mostrar os valores que foram aribuidos
    public String mostraNomeRg (ClienteDTO clienteDTO) { 
        return "O nome é: "+clienteDTO.getNome()+" e o RG: "
                + clienteDTO.getRG()+ ".";
    }
    
    //vamos criar outro método para mostrar nome e idade
    public String mostraNomeIdade(ClienteDTO clienteDTO){
        return "O nome é "+clienteDTO.getNome()+" e a Idade: "
                +clienteDTO.getIdade()+".";
        
        
    }
}