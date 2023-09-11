/*
 * Vamos criar os métodos para mostrar os dados 
 * 
 */
package F_encapsulamento_ex2;

/**
 *
 * @author aluno
 */
public class FuncionamentoDAO {
    public String mostraDados(FuncionarioDTO funcionarioDTO){
        
    
    return "Os dados do funcionário são: "+
            "\nNome: "+funcionarioDTO.getNome()+
            "\nCidade: "+funcionarioDTO.getCidade()+
            "\nTelefone: "+funcionarioDTO.getTelefone()+
            "\nSalário: "+funcionarioDTO.getSalario();
    
    }
    
}
