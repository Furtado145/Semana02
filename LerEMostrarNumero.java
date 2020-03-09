import javax.swing.JOptionPane;

public class LerEMostrarNumero{

   public static void main(String[] args){
   
      String numero;
      
      numero = JOptionPane.showInputDialog("Digite um valor:");
      
      JOptionPane.showMessageDialog(null,"O valor do numero digitado é " + numero);
   
   }

}