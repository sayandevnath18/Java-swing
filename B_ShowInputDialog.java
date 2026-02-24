import javax.swing.JOptionPane;

public class B_ShowInputDialog {
    public static void main(String[] args) {
        // String name = JOptionPane.showInputDialog("Enter your name: ");
        String name = JOptionPane.showInputDialog(null, "Enter your name: ", "This is title",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, name + " Welcome to swing");
    }
}
