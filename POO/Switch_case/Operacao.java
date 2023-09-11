/*
 Vamos criar um programa que receba três números inteiros e serão passados por parâmetros 
O primeiro será por opção de soma ou diferença.
Os dois seguintes serão os números para a operação.
Vamos utilizar a estrutura switch-case.
 */
package Switch_case;

/**
 *
 * @author aluno
 */
public class Operacao {
    //variáveis globais 
    private int n1, n2, opcao; 
    //vamos criar os métodos para o switch case 
    public String calcular( int opcao, int n1, int n2){
        //associar os valores locais 
        // atribuindo aos locais 
        this.opcao = opcao;
        this.n1 = n1;   
        this.n2 = n2; 
        //agora vamos utilizar o switch case
        //No swicth colocamos a variável a ser comparada 
        
        switch(opcao){
            //caso o valor seja igual a 1 
            case 1: 
                return "A soma é "+(this.n1+this.n2)+".";
            case 2:
                return "A diferença é "+(this.n1-this.n2)+".";
            //valor padrão- caso nenhum dos anteriores seja escolhido, então 
            // executa o default
            default:
                return "Opção Inválida.";
        }
        
    }
    
}
