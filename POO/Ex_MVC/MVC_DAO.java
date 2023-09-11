/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex_MVC;

/**
 *
 * @author aluno
 */
public class MVC_DAO {
    public String OrdemCrescente(MVC_DTO mvc_DTO){
        if((mvc_DTO.getN1()<mvc_DTO.getN2()) &&  (mvc_DTO.getN2() < mvc_DTO.getN3())){
            return "A ordem crescente é: "
                    + mvc_DTO.getN1() + " - "
                    + mvc_DTO.getN2() + " - "
                    + mvc_DTO.getN3() ;
        } 
            else if((mvc_DTO.getN1() > mvc_DTO.getN2()) && (mvc_DTO.getN1()<= mvc_DTO.getN3()) ){
                return "A ordem crescente é: "
                        +mvc_DTO.getN2() + " - "
                        +mvc_DTO.getN1() + " - "
                        +mvc_DTO.getN3() ;
                }
                else if ((mvc_DTO.getN1() > mvc_DTO.getN3()) && (mvc_DTO.getN1() >= mvc_DTO.getN2())){
                    return "A ordem crescente é: "
                            +mvc_DTO.getN3() + " - "
                            +mvc_DTO.getN2() + " - "
                            +mvc_DTO.getN1() ;
                    }
       else {
            return "Inválido";
            } 
    }
}
