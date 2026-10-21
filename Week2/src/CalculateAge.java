
import javax.swing.JOptionPane;


public class CalculateAge {
   public static void main (String[] args) {
       //get the years
       String syear = JOptionPane.showInputDialog("Enter your year ");
       int year = Integer.parseInt(syear);
       
       //calculate
       int age = 2026 - year;
       
       //diplay
       JOptionPane.showMessageDialog(null, "In 2026, your age is "+age);
   } 
}
