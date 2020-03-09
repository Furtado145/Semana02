import javax.swing.JOptionPane;

public class Data {

    public static void main(String[] args) {
        
        String dia;
        String mes;
        String ano;

        dia = JOptionPane.showInputDialog(null, "Que dia é hoje?");
        mes = JOptionPane.showInputDialog(null, "Em que mês?");
        ano = JOptionPane.showInputDialog(null, "De que ano?");

        JOptionPane.showInternalMessageDialog(null,"Certo, então hoje é " + dia +"/"+mes+"/"+ano);

    }    
}