/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2_MVC;

/**
 *
 * @author aluno
 */
public class AlturaPeso_DAO {
    public String categoriaPessoa(AlturaPeso_DTO alturaPeso_DTO){
        if((alturaPeso_DTO.getAltura() < 1.20) && (alturaPeso_DTO.getPeso() < 60)){
            return "Classificação A";
        } 
        else if((alturaPeso_DTO.getAltura() < 1.20) && (alturaPeso_DTO.getPeso()<= 60) 
            && (alturaPeso_DTO.getPeso() <= 90)){
            return "Classificação D";
        }
        else if((alturaPeso_DTO.getAltura() < 1.20) && (alturaPeso_DTO.getPeso() > 90)){
            return "Classificação G";
        }
        else if((alturaPeso_DTO.getAltura() >= 1.20) && (alturaPeso_DTO.getAltura() < 1.70)
                && (alturaPeso_DTO.getPeso() < 60)){
            return "Classificação B";
        }
        else if((alturaPeso_DTO.getAltura() >= 1.20)&&(alturaPeso_DTO.getAltura() < 1.70
                )&&(alturaPeso_DTO.getPeso()>=60)&&(alturaPeso_DTO.getPeso() <= 90)){
            return "Classificação E";
        }
        else if((alturaPeso_DTO.getAltura() >= 1.20)&&(alturaPeso_DTO.getAltura() < 1.70)
                &&(alturaPeso_DTO.getPeso() > 90)){
            return "Classificação H";
        }
        else if((alturaPeso_DTO.getAltura() > 1.70) && (alturaPeso_DTO.getPeso() < 60)){
            return "Classificação C";
        }
        else if((alturaPeso_DTO.getAltura() > 1.70) && (alturaPeso_DTO.getPeso() >= 60)
                && (alturaPeso_DTO.getPeso() <= 90)){
            return "Classificação F";
        }
        else if((alturaPeso_DTO.getAltura() > 1.70) && (alturaPeso_DTO.getPeso() > 90)){
            return "Classificação I";
        }
        else {
            return "Inválido";
        }
    }
}
