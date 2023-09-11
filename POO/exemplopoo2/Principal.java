
package exemplopoo2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        //vamos criar o objeto
        CalculaMedia calculamedia = new CalculaMedia();
        
        //vamos chamar o método que inicia o processamento 
        
        JOptionPane.showMessageDialog(null, calculamedia.calcula(
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")) ));
    }
           
           
         
    
    
    
}
