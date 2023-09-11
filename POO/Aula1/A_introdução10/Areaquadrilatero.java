/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introdução10;

/**
 *
 * @author Aluno
 */
public class Areaquadrilatero {

    int lado1, lado2, area;

    public void area(int l1, int l2) {
        
        this.lado1 = l1;
        this.lado2 = l2;
        
        this.area = l1 *l2;
        System.out.println(" A área do quadrilátero é de: "+this.area);

    }
}
