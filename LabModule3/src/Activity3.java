
import javax.swing.JOptionPane;

/****************************************************
*Author:  Rusyaidi Afiffhan Bin Rafhan
*Program Name: Calculate fahrenheit
*Description: Display the output at dialog use JOptionPane
*Date: 22 October 2026
*Modified Date: None
*Version: 1.0
*****************************************************/
public class Activity3 {
    public static void main(String[] args) {
        //get input from user
        String stemp = JOptionPane.showInputDialog("Please enter temperature in Celcius: ");
        double cels = Double.parseDouble(stemp);
        
        //calculate fahrenheit
        double feh = 9/5.0*cels+32;
        
        //display
        JOptionPane.showMessageDialog(null, feh);
        
    }
}
