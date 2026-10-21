
import javax.swing.JOptionPane;


public class CalculateAreaUsingDialogBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter radius");
        double radius = Double.parseDouble(input);
        
        //calculate area
        double area = radius * radius * Math.PI;
        
        //format output
        String msg = String.format("The area is %.2f", area);
        
        //output
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
