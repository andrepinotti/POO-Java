/*
 Vamos criar um programa que mostre a tabuada de um número inteiro 
 */
package C_for_ex1;

/**
 *
 * @author aluno
 */
public class tabuada {
    private int num;
    private String saida="";
    
    public String calcular(int num){
    
    this.num = num;
    for(int i=1; i<=10; i++){
        this.saida = this.saida + "\n"+i+" x "+this.num+" = "+(i*this.num);  
    }
    return saida;
    }
}
