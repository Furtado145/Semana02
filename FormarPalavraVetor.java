import javax.swing.JOptionPane;

   public class FormarPalavraVetor{
   
      public static void main(String[] args){
      
         char[] letra = new char[10];
         
         for (int i = 0; i < letra.length; i++) {
            letra[i] = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª letra:").charAt(0);
         }
         
         
         String saida = "Frase formada:\n";         
         for (int i = 0; i < letra.length; i++){
            saida = saida + letra[i]+"";
         }
         saida = saida + "\nFim";
         JOptionPane.showMessageDialog(null,saida,"Frase formada:", JOptionPane.PLAIN_MESSAGE);
      
   }
}