import javax.swing.JOptionPane;

   public class FormarFrase{
   
      public static void main(String[] args){
      
         char letra1, letra2, letra3, letra4, letra5;
         char letra6, letra7, letra8, letra9, letra10;
         
         String saida;
         
         letra1 = JOptionPane.showInputDialog(null,"Digite a primeira letra:").charAt(0);
         letra2 = JOptionPane.showInputDialog(null,"Digite a segunda letra:").charAt(0);
         letra3 = JOptionPane.showInputDialog(null,"Digite a terceira letra:").charAt(0);
         letra4 = JOptionPane.showInputDialog(null,"Digite a quarta letra:").charAt(0);
         letra5 = JOptionPane.showInputDialog(null,"Digite a quinta letra:").charAt(0);
         letra6 = JOptionPane.showInputDialog(null,"Digite a sexta letra:").charAt(0);
         letra7 = JOptionPane.showInputDialog(null,"Digite a setima letra:").charAt(0);
         letra8 = JOptionPane.showInputDialog(null,"Digite a oitava letra:").charAt(0);
         letra9 = JOptionPane.showInputDialog(null,"Digite a nona letra:").charAt(0);
         letra10 = JOptionPane.showInputDialog(null,"Digite a decima letra:").charAt(0);

         saida = "Frase formada:\n";
         saida =" "+ letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7 + letra8 + letra9 + letra10;
         saida += "\nFim.";

         JOptionPane.showMessageDialog(null,saida,"Frase formada:", JOptionPane.PLAIN_MESSAGE);
      
   }
}