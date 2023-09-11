/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex4;

public class MediaDTO {
    //vamos criar os atributos de classe 
    private double nota1, nota; 
    private String resposta="";
    
    //os métodos getters e setters para dar acesso aos atributo

    public double getNota1() {
        return nota1;
    }

    public double getNota() {
        return nota;
    }


    public String getResposta() {
        return resposta;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
   
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
}
