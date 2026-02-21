import javax.swing.JOptionPane;
public class User_input_dialog {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter First number"));
        int b= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Second number"));
        JOptionPane.showMessageDialog(null, "Their sum is: "+(a+b));
    }
}
