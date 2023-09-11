/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex3;

/**
 *
 * @author aluno
 */
public class PessoaDAO {
    public String mostraDados(PessoaDTO pessoaDTO){
    
        return "Os dados são: "+
                "\nNome: "+pessoaDTO.getNome()+
                "\nIdade: "+pessoaDTO.getIdade();
    
    }
    public String maiorMenor(PessoaDTO pessoaDTO){
    
        if(pessoaDTO.getIdade()>=18){
            return "É maior de idade.";
        } else
            return "É menor de idade";
    
    }
}
