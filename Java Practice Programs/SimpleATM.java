import javax.swing.JOptionPane;

public class SimpleATM {
    public static void main(String[] args) {
        
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an amount to Withdraw:"));
        int limit = 20000;
        if(amount>=500){
            if(amount<=limit){    
                JOptionPane.showMessageDialog(null, "Withdrawal Successful!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Your account's limit is "+limit+", Please try again.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Withdrawal amount should be 500 or greater.");
        }
    }
}
