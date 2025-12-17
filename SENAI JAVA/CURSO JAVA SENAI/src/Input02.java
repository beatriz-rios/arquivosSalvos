import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Dialogue Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Nova mensagem dos banidos!",
                "Dialog Title",
                2,
                null,
                null,
                "Outra mensagem aqui.");
        
        
        String[] acceptableValues = {"Ian", "Josué", "Nahyron"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
