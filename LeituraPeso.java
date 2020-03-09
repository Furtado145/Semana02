import javax.swing.JOptionPane;

public class LeituraPeso{

    public static void main(String[] args ){

        Double peso;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu peso?"));

        JOptionPane.showMessageDialog(null,"O peso informado foi "+peso+"Kg");

    }
}