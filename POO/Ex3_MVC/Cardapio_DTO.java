/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3_MVC;

/**
 *
 * @author aluno
 */
public class Cardapio_DTO {
    private double conta=0.0;
    private int opc;
    private String produto="";

    /**
     * @return the conta
     */
    public double getConta() {
        return conta;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(double conta) {
        this.conta = conta;
    }

    /**
     * @return the opc
     */
    public int getOpc() {
        return opc;
    }

    /**
     * @param opc the opc to set
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }
    
}
