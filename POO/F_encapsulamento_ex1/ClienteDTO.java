/*
 * Na classe DTO colocamos todas as variáveis e essas estarão protegidas
 * Não há acesso direto para as variáveis.
 * Precisamos utilizar os métodos 
 * Getters e Setters 
 */
package F_encapsulamento_ex1;

/**
 *
 * @author aluno
 */
public class ClienteDTO {
    //vamos criar as variáveis 
    private String nome, rg;
    private int idade;
    
    //vamos criar os setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRG(String rg){
        this.rg = rg;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    //vamos criar os getters 
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public String getRG(){
        return this.rg;
    }
}
