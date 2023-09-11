/*
 * Vamos reeditar com alguns novos métodos o código
para calcular a média aritmética de duas notas
 */
package exemplopoo2;

//Declaração de média 

import java.text.DecimalFormat;

public class CalculaMedia {

    
    
       //Vamos criar uma mascara para mostrar os valores da nota recebidos
       DecimalFormat decimalFormat = new DecimalFormat("00.00"); 
       //declara as variáveis 
       private double n1, n2, media; 
       private String resposta;
               
       //vamos criar o método para calcular a média
       public void calcmedia(){
           //formula´para calcular a média
           this.media= (this.n1+this.n2)/2;
       
       }
               
       //Criar o método para verificar se o aluno está aprovado 
       public void situacao(){
           //criar um desvio condicional
           //para verificar a situação do aluno
           
           if(this.media>=6){
           resposta = "Aprovado";
           }
           else{
           resposta="Reprovado";
           }
           if(this.media>=4 && this.media<6){
           resposta = "O aluno está de IFA";
           }
       }//termina o método situação
       
       
       //criar o método que calcule o método de processamento 
       public String calcula(double n1, double n2){
       //vamos atribuir os valores n1 e n2
       this.n1=n1;
       this.n2=n2;
       //agora vamos chamar o método para calcular 
       calcmedia();
       //chamamos o método para verificar a situação
       situacao();
       
       //retorno de  1 valor string
       return "A nota do aluno é "+decimalFormat.format(this.media)+
              ". \nE sua situação é: "+this.resposta+".";
       
       
       
    }
    
}

