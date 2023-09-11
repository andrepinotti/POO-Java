/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX12_MVC;

/**
 *Escreva um algoritmo que leia o número de andares de um prédio e, a
seguir, para cada andar do prédio, leia o número de pessoas que entraram
e saíram do elevador.
 */
public class Predio_DTO {
    private int andar; 
    private int nsai, nentra;

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the nsai
     */
    public int getNsai() {
        return nsai;
    }

    /**
     * @param nsai the nsai to set
     */
    public void setNsai(int nsai) {
        this.nsai = nsai;
    }

    /**
     * @return the nentra
     */
    public int getNentra() {
        return nentra;
    }

    /**
     * @param nentra the nentra to set
     */
    public void setNentra(int nentra) {
        this.nentra = nentra;
    }
    
    
    
}
