/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_ex4;

public class MediaDAO {
    //aqui vamos verificar se o aluno está aprovado ou reprovado
    private double media; 
    
    public String calculaMedia(MediaDTO mediaDTO){
        this.media=(mediaDTO.getNota1()+mediaDTO.getNota())/2;
        
        if(this.media>=7){
            mediaDTO.setResposta("Aluno aprovado com média "+this.media);
        }
        else {
            mediaDTO.setResposta("Aluno reprovado com média "+this.media);
        }
        return mediaDTO.getResposta();
    }
}
