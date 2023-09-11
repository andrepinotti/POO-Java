/*
 Faça um programa que receba um valor inteiro de 1 a 12 e mostre qual é o 
respectivo mês do ano.
 */
package B_swicth2;

/**
 *
 * @author aluno
 */
public class Mes {
    //variáveis globais 
    private int mes;
    //método para o swicth case 
    public String respectivomes(int mes){
    //atribuir os valores globais aos locais 
    this.mes= mes;
    
    switch(mes){
        case 1: 
            return "O respectivo mês é janeiro." ;
        case 2: 
            return "O respectivo mês é janeiro.";
        case 3:
            return "O respectivo mês é marco.";
        case 4: 
            return "O respectivo mês é abril.";
        case 5:
            return "O respectivo mês é maio.";
        case 6: 
            return "O respectivo mês é junho.";
        case 7: 
            return "O respectivo mês é julho.";
        case 8:
            return "O respectivo mês é agosto.";
        case 9: 
            return "O respectivo mês é setembro.";
        case 10: 
            return "O respectivo mês é outubro.";
        case 11: 
            return "O respectivo mês é novembro.";
        case 12: 
            return "O respectivo mẽs é dezembro.";
            //valor padrão- caso nenhum dos anteriores seja escolhido, então 
            // executa o default
        default:
            return "Opção inválida.";
    }
    }
}
