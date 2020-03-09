import javax.swing.JOptionPane;
public class Ler4Numeros{

   public static void main(String[] args){
   
      char milhar; char centena; char dezena; char unidade;
      String numero = "";
      
      milhar = JOptionPane.showInputDialog(null, "Digite o milhar:").charAt(0);
      centena = JOptionPane.showInputDialog(null, "Digite a centena:").charAt(0);
      dezena = JOptionPane.showInputDialog(null, "Difite a dezena:").charAt(0);
      unidade = JOptionPane.showInputDialog(null, "Digite a unidade:").charAt(0);
      
      numero ="O numero dado é \n" +  milhar + centena + dezena + unidade;
      
      JOptionPane.showMessageDialog(null,numero);
      
   }
}
