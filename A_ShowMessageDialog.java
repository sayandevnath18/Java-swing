import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class A_ShowMessageDialog {
    public static void main(String[] args) {
        // null - centering er jno
        JOptionPane.showMessageDialog(null, "Wrong password");
        JOptionPane.showMessageDialog(null, "Wrong password", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong password", "Warning", -1);

        ImageIcon icon = new ImageIcon("bangla.png");
        JOptionPane.showMessageDialog(null, "Wrong password", "Warning", JOptionPane.ERROR_MESSAGE, icon);
    }
}