
 // VAMOS CRIAR O PRIMEIRO EXEMPLO DE UMA CLASSE NO JAVA
 
package Aula1;


//código para criação da classe.
public class Cliente {
    //vamos criar as variáveis/atributos
    private String nome, rg;

    
    //vamos criar o método para mostrar
    //todas as informações das variáveis 
    //Esse método possui passagem de parâmetros 
    public void mostrar(String nome, String rg){
        //vamos atribuir na variável global,
        //os valores das variáveis locais
        //this identifica variável
        //global/de classe 
        this.nome = nome;
        this.rg = rg;
        System.out.println("O nome informado "
        + "foi: "+this.nome+" e o RG:"
        +this.rg+".");
        //O sinal de mais serve para concatenar
        //Serve para juntar valores 
    }//finaliza método mostrar()
    
    //Agora vamos criar um método para mostrar
    //apenas o nome 
    public void mostrarNome() {
        //vamos mostrar o nome 
        System.out.println("O nome é: "+this.nome+".") ;
    }
    
    public void mostrarRG(){
        //vamos mostrar somente o rg
        System.out.println("O RG é: "+this.rg+".");
    }
    
}
