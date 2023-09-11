//1- mostrar em ordem crescente
//2- mostrar em ordem decrescente 

//vamos criar um método com passagem de parâmetro desses 3 parâmetros: método(
//n1, n2, escolha);
package A_introdução7;


public class OrdemCrescente {

    int num1, num2; 

    public void ordenador(int n1,int n2, int escolha ){
    
        this.num1 = n1;
        this.num2 = n2;
        //vamos fazer a escolha 
        if(escolha == 1){
            //verificar maior/menor
            if(this.num1>this.num2){
                System.out.println("Crescente: "+this.num2+", "+this.num1);
            }
            if(this.num1<this.num2){
                System.out.println("Crescente "+this.num1+", "+this.num2);
            }
        }
        else if(escolha == 2){
            if(this.num1>this.num2){
                System.out.println("Decrescente: "+this.num1+", "+this.num2);
            }
            if(this.num1<this.num2){
                System.out.println("Decrescente "+this.num2+", "+this.num1);
        
        } 
        }
        else {
            System.out.println("Digito inválido.");
        }
    
    }
}
