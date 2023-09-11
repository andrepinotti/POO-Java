/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_exceçao_ex1;

/**
 *
 * @author aluno
 */
public class Divisão {
    private double numero, resultado; 

    //vamos criar um método para realizar
    //um determinado cálculo 
    public void calculaDivisao(double numero, double valor){
        //try inicia o espaço de tratamento 
        try{
            //vamos dividir por zero 
            this.numero = numero;
            this.resultado = this.numero/valor;
            System.out.println("O resultado da divisão é: "+ this.resultado);
        }
       catch(Exception e){
           System.out.println(
                   "Erro: "+e.getMessage());
       }
    }
}
