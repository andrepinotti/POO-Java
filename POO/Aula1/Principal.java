/*
 * Nessa classe principal iremos criar uma instância/objeto
 * da classe cliente e em seguida iremos verificar se o código 
 * está funcionando 
 */
package Aula1;

//criamos o nome da classe 
public class Principal {
    //vamos criar o método principal
    public static void main(String args[]){
        
        //vamos criar o objeto/instância 
         Cliente cliente = new Cliente() ; 
        
         //Vamos criar um segundo objeto/instância 
         Cliente cliente2 = new Cliente();
         
         //vamos utilizar o objeto cliente 
        cliente.mostrar("José","21.234.211-4");
        
        cliente.mostrarNome();
        
        cliente.mostrarRG();
        
        //vamos atribuir os valores para gustavo 
        //com rg 32.268.300-7
        
        cliente2.mostrar("Gustavo","32.268.300-7");
        //mostrar apenas o nome agora    
        cliente2.mostrarNome();
        //mostrar apenas o RG
        cliente2.mostrarRG();
    
}
    
}
