
import javax.swing.JOptionPane;


public class CalculateBMI {
    public static void main (String[] args) {
        //get name, weight, height
        String name = JOptionPane.showInputDialog("Please enter your name");
        String str_weight = JOptionPane.showInputDialog("Please enter your weight");
        String str_height = JOptionPane.showInputDialog("Please enter your height");
        
        double weight = Double.parseDouble(str_weight);
        double height = Double.parseDouble(str_height);
        //calculate bmi
        double bmi = weight / (height * height);
        
        String msg = String.format("Name:%s\nWeight:%.2f\nHeight:%.2f\nBMI%.2f", name, weight, height, bmi);
        
        //display output
        JOptionPane.showMessageDialog(null, msg );
        
    }
}
